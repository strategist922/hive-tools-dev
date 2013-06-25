package test;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Partitioner;

/**
 * 
 * 二次排序工具，调用<b> makeKey(priority,key)</b>生成BytesWritable,使用</br>
 * 
 * <li>job.setPartitionerClass(SecondarySortTool.KeyPartitioner.class);
 * 
 * <li>
 * job.setOutputValueGroupingComparator(SecondarySortTool.GroupingComparator.
 * class);
 * 
 * <li>job.setOutputKeyComparatorClass(SecondarySortTool.Comparator.class);<br>
 * 
 * @author tieyi.lq@taobao.com
 * 
 * @since Wed Apr 14 2013
 * 
 * @version 0.0.1
 */

public class SecondarySortTool {

	private static final int LENGTH_BYTES = 4;

	public static BytesWritable makeKey(int priority, String key) {

		if (priority > 127 || priority < -128) {

			throw new RuntimeException("priority must in [-128 ~ 127]");

		}

		return makeKey((byte) priority, key.getBytes());

	}

	public static BytesWritable makeKey(int priority, long key) {

		if (priority > 127 || priority < -128) {

			throw new RuntimeException("priority must in [-128 ~ 127]");

		}

		return makeKey((byte) priority, java.lang.Long.toString(key).getBytes());

	}

	public static BytesWritable makeKey(int priority, int key) {

		if (priority > 127 || priority < -128) {

			throw new RuntimeException("priority must in [-128 ~ 127]");

		}

		return makeKey((byte) priority, java.lang.Integer.toString(key)
				.getBytes());

	}

	public static BytesWritable makeKey(int priority, byte[] realKey) {

		if (priority > 127 || priority < -128) {

			throw new RuntimeException("priority must in [-128 ~ 127]");

		}

		return makeKey((byte) priority, realKey);

	}

	public static BytesWritable makeKey(byte priority, byte[] realKey) {

		byte[] key = new byte[realKey.length + 1];

		key[0] = priority;

		System.arraycopy(realKey, 0, key, 1, realKey.length);

		return new BytesWritable(key);

	}

	public static class KeyPartitioner implements
			Partitioner<BytesWritable, Writable> {

		@Override
		public void configure(JobConf job) {

		}

		@Override
		public int getPartition(BytesWritable key, Writable value,
				int numPartitions) {

			byte[] bytes = key.getBytes();

			int hash = 1;

			for (int i = 1; i < key.getLength(); i++)

				hash = (31 * hash) + (int) bytes[i];

			return (hash & Integer.MAX_VALUE) % numPartitions;

		}

	}

	public static class GroupingComparator implements
			RawComparator<BytesWritable> {

		@Override
		public int compare(BytesWritable o1, BytesWritable o2) {

			byte[] a = o1.getBytes();

			byte[] b = o2.getBytes();

			return WritableComparator.compareBytes(a, 1, o1.getLength() - 1, b,
					1, o2.getLength() - 1);

		}

		@Override
		public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {

			return WritableComparator.compareBytes(b1, s1 + LENGTH_BYTES + 1,
					l1 - 1 - LENGTH_BYTES, b2, s2 + 1 + LENGTH_BYTES, l2 - 1
							- LENGTH_BYTES);

		}

	}

	public static class Comparator implements RawComparator<BytesWritable> {

		@Override
		public int compare(BytesWritable o1, BytesWritable o2) {

			byte[] a = o1.getBytes();

			byte[] b = o2.getBytes();

			int t = WritableComparator.compareBytes(a, 1, o1.getLength() - 1,
					b, 1, o2.getLength() - 1);

			if (t == 0) {

				return a[0] > b[0] ? 1 : (a[0] < b[0] ? -1 : 0);

			} else {

				return t;

			}

		}

		@Override
		public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {

			int t = WritableComparator.compareBytes(b1, s1 + LENGTH_BYTES + 1,
					l1 - 1 - LENGTH_BYTES, b2, s2 + 1 + LENGTH_BYTES, l2 - 1
							- LENGTH_BYTES);

			if (t == 0) {

				t = b1[s1 + LENGTH_BYTES] > b2[s2 + LENGTH_BYTES] ? 1 : (b1[s1
						+ LENGTH_BYTES] < b2[s2 + LENGTH_BYTES] ? -1 : 0);

			}

			return t;

		}

	}

}