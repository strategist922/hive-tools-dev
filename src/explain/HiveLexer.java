// $ANTLR 3.0.1 /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g 2013-07-13 22:17:12
package explain;

import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class HiveLexer extends Lexer {
    public static final int TOK_FUNCTIONDI=22;
    public static final int LSQUARE=469;
    public static final int TOK_PRIV_SHOW_DATABASE=231;
    public static final int KW_REPAIR=379;
    public static final int KW_FORMAT=387;
    public static final int TOK_STOREDASDIRS=259;
    public static final int TOK_ALTERTABLE_ALTERPARTS_MERGEFILES=245;
    public static final int KW_FIRST=319;
    public static final int TOK_OP_GT=30;
    public static final int TOK_ALTERTABLE_SERDEPROPERTIES=115;
    public static final int KW_GROUPING=450;
    public static final int KW_DROP=301;
    public static final int TinyintLiteral=465;
    public static final int KW_EXPLAIN=261;
    public static final int KW_PERCENT=444;
    public static final int TOK_PRIV_ALTER_DATA=226;
    public static final int TOK_OP_GE=29;
    public static final int EQUAL_NS=481;
    public static final int RPAREN=298;
    public static final int TOK_OP_ADD=32;
    public static final int KW_DBPROPERTIES=295;
    public static final int TOK_SHOW_CREATETABLE=130;
    public static final int TOK_TABCOLNAME=162;
    public static final int TOK_FUNCTIONSTAR=23;
    public static final int KW_THEN=460;
    public static final int TOK_FROM=9;
    public static final int TOK_TINYINT=75;
    public static final int DIVIDE=423;
    public static final int TOK_ALTERTABLE_LOCATION=119;
    public static final int TOK_INDEXCOMMENT=239;
    public static final int KW_HOLD_DDLTIME=428;
    public static final int KW_SHOW_DATABASE=375;
    public static final int TOK_SHOW_GRANT=216;
    public static final int TOK_ALTERTABLE_SERIALIZER=116;
    public static final int TOK_DESCDATABASE=240;
    public static final int TOK_DESCFUNCTION=102;
    public static final int KW_FILEFORMAT=328;
    public static final int KW_FETCH=497;
    public static final int KW_TRANSFORM=421;
    public static final int KW_MATERIALIZED=499;
    public static final int TOK_TABCOLVALUES=253;
    public static final int TOK_LEFTSEMIJOIN=208;
    public static final int KW_UNIQUEJOIN=431;
    public static final int TOK_TBLSEQUENCEFILE=150;
    public static final int TOK_SELEXPR=8;
    public static final int KW_SELECT=374;
    public static final int TOK_UNIQUEJOIN=67;
    public static final int TOK_MAP=89;
    public static final int TOK_PRIV_ALL=224;
    public static final int KW_BUCKET=441;
    public static final int KW_LOAD=265;
    public static final int KW_GROUP=376;
    public static final int TOK_HOLD_DDLTIME=202;
    public static final int TOK_PRIV_OBJECT=233;
    public static final int KW_TO=274;
    public static final int KW_CHANGE=317;
    public static final int KW_DISTRIBUTE=455;
    public static final int KW_NOT=282;
    public static final int KW_ELSE=461;
    public static final int TOK_TMP_FILE=170;
    public static final int KW_INPATH=268;
    public static final int KW_OUT=442;
    public static final int KW_BOOLEAN=403;
    public static final int TOK_ALTERTABLE_ALTERPARTS_PROTECTMODE=111;
    public static final int TOK_STRUCT=88;
    public static final int TOK_DOUBLE=81;
    public static final int KW_INDEXES=365;
    public static final int TOK_SHOWLOCKS=133;
    public static final int KW_REGEXP=480;
    public static final int TOK_DATETIME=83;
    public static final int TOK_STORAGEHANDLER=160;
    public static final int HexDigit=520;
    public static final int KW_SORT=456;
    public static final int KW_FROM=277;
    public static final int KW_DEFERRED=307;
    public static final int TOK_UNLOCKTABLE=135;
    public static final int TOK_MAPJOIN=200;
    public static final int KW_REDUCE=429;
    public static final int TOK_TIMESTAMP=84;
    public static final int TOK_IFNOTEXISTS=196;
    public static final int TOK_TBLTEXTFILE=151;
    public static final int KW_FOR=357;
    public static final int TOK_ALTERTABLE_FILEFORMAT=118;
    public static final int KW_READS=506;
    public static final int KW_SET=313;
    public static final int PLUS=425;
    public static final int TOK_TABSORTCOLNAMEDESC=172;
    public static final int KW_REBUILD=308;
    public static final int TOK_RESTRICT=248;
    public static final int KW_EXTENDED=262;
    public static final int TOK_LOAD=69;
    public static final int TOK_TABALIAS=210;
    public static final int TOK_IFEXISTS=195;
    public static final int KW_LOCATION=296;
    public static final int KW_MSCK=378;
    public static final int TOK_ALTERTABLE_TOUCH=112;
    public static final int TOK_TRANSFORM=46;
    public static final int LESSTHAN=412;
    public static final int KW_DELIMITED=388;
    public static final int TOK_FUNCTION=21;
    public static final int TOK_CREATEINDEX=95;
    public static final int KW_WHEN=459;
    public static final int TOK_TABLEROWFORMATLINES=149;
    public static final int TOK_CREATEFUNCTION=175;
    public static final int AMPERSAND=477;
    public static final int TOK_SHOWTABLES=126;
    public static final int KW_EXPORT=273;
    public static final int KW_CUBE=449;
    public static final int MINUS=471;
    public static final int KW_FIELDS=389;
    public static final int Tokens=526;
    public static final int KW_SEQUENCEFILE=340;
    public static final int TOK_FALSE=45;
    public static final int COLON=398;
    public static final int TOK_TABLECOMMENT=142;
    public static final int SmallintLiteral=464;
    public static final int TOK_ALTERTABLE_RENAMEPART=107;
    public static final int TOK_LIKETABLE=100;
    public static final int TOK_IGNOREPROTECTION=260;
    public static final int TOK_SMALLINT=76;
    public static final int TOK_PRIV_LOCK=229;
    public static final int TOK_CREATEINDEX_INDEXTBLNAME=96;
    public static final int TOK_OP_LT=28;
    public static final int KW_TABLESAMPLE=440;
    public static final int TOK_GRANT_WITH_OPTION=223;
    public static final int TOK_TABLEPROPERTY=194;
    public static final int RCURLY=516;
    public static final int TOK_FULLOUTERJOIN=66;
    public static final int TOK_OP_LE=27;
    public static final int KW_USING=422;
    public static final int TOK_INDEXPROPERTIES=190;
    public static final int KW_NULL=468;
    public static final int TOK_OP_AND=40;
    public static final int TOK_OP_MOD=35;
    public static final int KW_SERDE=326;
    public static final int TOK_HINTARGLIST=203;
    public static final int KW_TINYINT=399;
    public static final int TOK_TABCOLVALUE_PAIR=252;
    public static final int TOK_PERCENT=167;
    public static final int TOK_GROUPBY=52;
    public static final int TOK_CHARSETLITERAL=174;
    public static final int KW_CROSS=433;
    public static final int TOK_TABLEPARTCOLS=143;
    public static final int KW_COLLECTION=392;
    public static final int TOK_CUBE_GROUPBY=54;
    public static final int TOK_ALTERTABLE_DROPPARTS=110;
    public static final int TOK_SERDEPROPS=49;
    public static final int KW_INSERT=417;
    public static final int BITWISEXOR=474;
    public static final int TOK_OP_OR=41;
    public static final int TOK_DROPTABLE=138;
    public static final int KW_ROWS=445;
    public static final int TOK_INDEXPROPLIST=191;
    public static final int TOK_TABLEROWFORMATMAPKEYS=148;
    public static final int TOK_TABLEBUCKETSAMPLE=165;
    public static final int Identifier=293;
    public static final int TOK_PARTVAL=12;
    public static final int TOK_OP_NE=26;
    public static final int TOK_TABLEBUCKETS=144;
    public static final int KW_RLIKE=479;
    public static final int TOK_STRINGLITERALSEQUENCE=173;
    public static final int KW_SCHEMAS=360;
    public static final int TOK_OP_NOT=42;
    public static final int COMMENT=525;
    public static final int KW_PROTECTION=289;
    public static final int KW_READONLY=336;
    public static final int TOK_ALIASLIST=51;
    public static final int KW_ESCAPED=391;
    public static final int TOK_INSERT=4;
    public static final int KW_SMALLINT=400;
    public static final int KW_INT=401;
    public static final int TOK_TABSRC=247;
    public static final int TOK_SKEWED_LOCATION_LIST=257;
    public static final int KW_TEXTFILE=341;
    public static final int TOK_USERSCRIPTCOLNAMES=204;
    public static final int KW_RENAME=314;
    public static final int TOK_UNIONTYPE=90;
    public static final int TOK_ALTERTABLE_REPLACECOLS=108;
    public static final int TOK_LATERAL_VIEW=209;
    public static final int KW_BINARY=410;
    public static final int TOK_STRING=85;
    public static final int KW_END=462;
    public static final int TOK_CLUSTERBY=59;
    public static final int TOK_REVOKE_ROLE=236;
    public static final int TOK_FLOAT=80;
    public static final int TOK_SORTBY=61;
    public static final int KW_TABLES=361;
    public static final int TOK_PRIV_OBJECT_COL=234;
    public static final int Letter=519;
    public static final int KW_CURSOR=512;
    public static final int TOK_SHOWCOLUMNS=127;
    public static final int KW_TIMESTAMP=408;
    public static final int TOK_SELECTDI=7;
    public static final int KW_COLUMNS=316;
    public static final int KW_UNLOCK=369;
    public static final int KW_UNIONTYPE=415;
    public static final int KW_DESCRIBE=351;
    public static final int TOK_CREATETABLE=93;
    public static final int TOK_DROPDATABASE=137;
    public static final int KW_RCFILE=342;
    public static final int KW_CREATE=290;
    public static final int KW_MAPJOIN=426;
    public static final int TOK_DROPVIEW=178;
    public static final int KW_WITH=294;
    public static final int TOK_LENGTH=168;
    public static final int TOK_PRINCIPAL_NAME=219;
    public static final int TOK_SHOW_ROLE_GRANT=237;
    public static final int TOK_PRIVILEGE=218;
    public static final int TOK_DROPTABLE_PROPERTIES=99;
    public static final int TOK_ALTERTABLE_RENAMECOL=106;
    public static final int KW_GRANT=370;
    public static final int Number=337;
    public static final int COMMA=299;
    public static final int KW_WHILE=504;
    public static final int EQUAL=330;
    public static final int KW_UNARCHIVE=323;
    public static final int KW_RECORDREADER=384;
    public static final int TOK_DESTINATION=18;
    public static final int KW_OFFLINE=334;
    public static final int TOK_OP_BITAND=36;
    public static final int TOK_GROUPING_SETS=55;
    public static final int TOK_HAVING=57;
    public static final int KW_RESTRICT=280;
    public static final int KW_UNION=416;
    public static final int KW_TEMPORARY=380;
    public static final int KW_CAST=457;
    public static final int KW_FALSE=488;
    public static final int KW_IDXPROPERTIES=310;
    public static final int KW_INTERSECT=498;
    public static final int TOK_EXPLAIN=186;
    public static final int TOK_ALTERTABLE_PARTITION=103;
    public static final int TOK_FILEFORMAT_GENERIC=154;
    public static final int TOK_ROWCOUNT=169;
    public static final int KW_STORED=283;
    public static final int TOK_PRIV_ALTER_METADATA=225;
    public static final int KW_CASE=458;
    public static final int TOK_SKEWED_LOCATION_MAP=258;
    public static final int TOK_OP_BITNOT=37;
    public static final int TOK_TABCOLLIST=140;
    public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=121;
    public static final int TOK_TABTYPE=192;
    public static final int QUESTION=517;
    public static final int TOK_HINTLIST=198;
    public static final int KW_AS=284;
    public static final int KW_BEFORE=509;
    public static final int TOK_OFFLINE=155;
    public static final int KW_KEY_TYPE=349;
    public static final int TOK_TABLELOCATION=163;
    public static final int TOK_ANALYZE=211;
    public static final int TOK_RECORDREADER=206;
    public static final int KW_ALTER=311;
    public static final int KW_PARTITIONED=381;
    public static final int TOK_TABREF=15;
    public static final int KW_LIKE=303;
    public static final int KW_EXCLUSIVE=368;
    public static final int KW_JOIN=432;
    public static final int STAR=424;
    public static final int TOK_GROUPING_SETS_EXPRESSION=56;
    public static final int TOK_ALTERTABLE_ARCHIVE=113;
    public static final int KW_PLUS=495;
    public static final int MOD=475;
    public static final int KW_ITEMS=393;
    public static final int KW_ROW=386;
    public static final int TOK_OP_EQ=25;
    public static final int TOK_CASCADE=249;
    public static final int TOK_VIEWPARTCOLS=185;
    public static final int KW_CONCATENATE=331;
    public static final int KW_REVOKE=371;
    public static final int ByteLengthLiteral=446;
    public static final int KW_FLOAT=404;
    public static final int KW_BOTH=510;
    public static final int EOF=-1;
    public static final int TOK_SHOWDATABASES=125;
    public static final int KW_ASC=397;
    public static final int TOK_DATABASECOMMENT=139;
    public static final int RegexComponent=523;
    public static final int KW_CASCADE=281;
    public static final int KW_PARTITIONS=363;
    public static final int KW_RANGE=508;
    public static final int TOK_GRANT=214;
    public static final int TOK_QUERY=5;
    public static final int TOK_ORREPLACE=197;
    public static final int TOK_ALTERVIEW_RENAME=184;
    public static final int TOK_RIGHTOUTERJOIN=65;
    public static final int TOK_PRIV_SELECT=230;
    public static final int KW_TABLE=272;
    public static final int TOK_RECORDWRITER=207;
    public static final int TOK_ALTERVIEW_ADDPARTS=182;
    public static final int KW_SCHEMA=292;
    public static final int KW_OPTION=377;
    public static final int TOK_TABLESPLITSAMPLE=166;
    public static final int TOK_COLTYPELIST=91;
    public static final int TOK_ALTERTBLPART_SKEWED_LOCATION=255;
    public static final int KW_ENABLE=332;
    public static final int TOK_BIGINT=78;
    public static final int KW_ADD=315;
    public static final int TOK_ALTERTABLE_RENAME=104;
    public static final int KW_LATERAL=439;
    public static final int LCURLY=515;
    public static final int SEMICOLON=514;
    public static final int TOK_TABCOL=141;
    public static final int KW_DELETE=494;
    public static final int KW_OUTPUTDRIVER=346;
    public static final int TOK_ALTERINDEX_REBUILD=122;
    public static final int TOK_WHERE=24;
    public static final int KW_TBLPROPERTIES=324;
    public static final int WS=524;
    public static final int TOK_TABLEROWFORMATFIELD=146;
    public static final int KW_REPLACE=287;
    public static final int KW_LOCK=366;
    public static final int TOK_ALTERVIEW_DROPPARTS=183;
    public static final int KW_BY=382;
    public static final int TOK_UNION=62;
    public static final int TOK_SELECT=6;
    public static final int TOK_OP_LIKE=43;
    public static final int KW_SEMI=438;
    public static final int KW_LOCAL=267;
    public static final int TOK_EXPORT=70;
    public static final int TOK_TABLEPROPLIST=189;
    public static final int KW_UTC=491;
    public static final int KW_INPUTDRIVER=345;
    public static final int TOK_PRIV_INDEX=228;
    public static final int KW_LINES=396;
    public static final int TOK_SHOW_TABLESTATUS=131;
    public static final int KW_AND=486;
    public static final int TOK_SUBQUERY=16;
    public static final int KW_CLUSTERSTATUS=490;
    public static final int CharSetName=466;
    public static final int TOK_CROSSJOIN=68;
    public static final int TOK_DROPFUNCTION=176;
    public static final int TOK_DISABLE=157;
    public static final int KW_DIRECTORY=418;
    public static final int TOK_DESCTABLE=101;
    public static final int KW_SHARED=367;
    public static final int KW_COMPUTE=355;
    public static final int KW_PARTITION=489;
    public static final int TOK_READONLY=158;
    public static final int LPAREN=297;
    public static final int GREATERTHANOREQUALTO=484;
    public static final int KW_FORMATTED=263;
    public static final int KW_STRUCT=414;
    public static final int KW_USE=300;
    public static final int KW_TERMINATED=390;
    public static final int TOK_TRUE=44;
    public static final int TOK_CREATEVIEW=177;
    public static final int TOK_LOCAL_DIR=14;
    public static final int TOK_DROPINDEX=98;
    public static final int KW_IN=309;
    public static final int KW_SSL=500;
    public static final int KW_INPUTFORMAT=343;
    public static final int KW_IS=473;
    public static final int KW_OUTER=435;
    public static final int KW_IF=278;
    public static final int KW_DATABASES=359;
    public static final int TOK_ALTERVIEW_PROPERTIES=180;
    public static final int KW_ORDER=453;
    public static final int KW_ALL=372;
    public static final int KW_HAVING=452;
    public static final int TOK_GRANT_ROLE=235;
    public static final int TOK_ISNULL=73;
    public static final int TOK_ALLCOLREF=19;
    public static final int KW_FUNCTIONS=362;
    public static final int TOK_DIR=13;
    public static final int BITWISEOR=478;
    public static final int KW_SERDEPROPERTIES=327;
    public static final int StringLiteral=269;
    public static final int KW_ANALYZE=354;
    public static final int TOK_TABCOLVALUE=251;
    public static final int CharSetLiteral=467;
    public static final int TOK_TABLE_OR_COL=20;
    public static final int KW_PROCEDURE=502;
    public static final int TOK_TRUNCATETABLE=94;
    public static final int TOK_ALTERTABLE_ADDPARTS=109;
    public static final int KW_CLUSTERED=339;
    public static final int KW_TRUNCATE=304;
    public static final int KW_DISABLE=333;
    public static final int KW_NO_DROP=335;
    public static final int KW_PURGE=507;
    public static final int KW_COMMENT=302;
    public static final int DIV=476;
    public static final int TOK_CREATEDATABASE=92;
    public static final int KW_DATABASE=291;
    public static final int TOK_MSCK=124;
    public static final int KW_RECORDWRITER=385;
    public static final int TOK_DROPROLE=213;
    public static final int TOK_ROLE=222;
    public static final int TOK_OP_BITXOR=39;
    public static final int KW_TOUCH=321;
    public static final int TOK_ALTERTABLE_ADDCOLS=105;
    public static final int KW_DATETIME=407;
    public static final int KW_STRING=409;
    public static final int TOK_SHOWINDEXES=238;
    public static final int TOK_CREATEROLE=212;
    public static final int KW_OUTPUTFORMAT=344;
    public static final int KW_LONG=493;
    public static final int TOK_NULL=72;
    public static final int TOK_GROUP=221;
    public static final int KW_WHERE=447;
    public static final int KW_EXISTS=279;
    public static final int TOK_OP_DIV=31;
    public static final int TOK_TABNAME=246;
    public static final int NOTEQUAL=482;
    public static final int KW_LOCKS=364;
    public static final int TOK_TABLE_PARTITION=117;
    public static final int TOK_INSERT_INTO=17;
    public static final int TOK_DATE=82;
    public static final int KW_UPDATE=373;
    public static final int KW_OVERWRITE=270;
    public static final int TOK_TABLEROWFORMAT=145;
    public static final int TOK_NO_DROP=159;
    public static final int KW_DISTINCT=420;
    public static final int TOK_PRIVILEGE_LIST=217;
    public static final int GREATERTHAN=413;
    public static final int TOK_ISNOTNULL=74;
    public static final int TOK_SHOWPARTITIONS=129;
    public static final int KW_FUNCTION=353;
    public static final int KW_PRESERVE=430;
    public static final int KW_CLUSTER=454;
    public static final int TOK_BINARY=86;
    public static final int TOK_EXPLIST=50;
    public static final int TOK_USER=220;
    public static final int TOK_DISTRIBUTEBY=60;
    public static final int TOK_LIST=87;
    public static final int TOK_TBLRCFILE=152;
    public static final int TOK_ALTERTABLE_UNARCHIVE=114;
    public static final int KW_SETS=451;
    public static final int KW_ARCHIVE=322;
    public static final int TOK_HINT=199;
    public static final int TOK_TABLEPROPERTIES=188;
    public static final int TOK_SERDE=47;
    public static final int KW_KEYS=395;
    public static final int KW_LEFT=434;
    public static final int KW_IMPORT=275;
    public static final int KW_DEPENDENCY=264;
    public static final int KW_VIEW=312;
    public static final int TOK_SHOWFUNCTIONS=128;
    public static final int KW_DOUBLE=405;
    public static final int TOK_TABLESERIALIZER=187;
    public static final int KW_IGNORE=288;
    public static final int TOK_LEFTOUTERJOIN=64;
    public static final int KW_SORTED=383;
    public static final int TOK_DBPROPLIST=243;
    public static final int TOK_LOCKTABLE=134;
    public static final int KW_MAP=394;
    public static final int KW_ELEM_TYPE=348;
    public static final int KW_FULL=437;
    public static final int TOK_TABLESKEWED=250;
    public static final int TOK_SERDENAME=48;
    public static final int TOK_ENABLE=156;
    public static final int TOK_DATABASELOCATION=242;
    public static final int TOK_PARTITIONLOCATION=164;
    public static final int LESSTHANOREQUALTO=483;
    public static final int KW_ARRAY=411;
    public static final int KW_BUCKETS=338;
    public static final int DOLLAR=518;
    public static final int TOK_ALTERVIEW_AS=179;
    public static final int TOK_DROPVIEW_PROPERTIES=181;
    public static final int KW_UTCTIMESTAMP=492;
    public static final int TOK_SKEWED_LOCATIONS=256;
    public static final int KW_READ=505;
    public static final int TOK_OP_MUL=34;
    public static final int TOK_ALTERTABLE_CLUSTER_SORT=161;
    public static final int KW_DESC=352;
    public static final int TOK_PRIV_DROP=227;
    public static final int Exponent=522;
    public static final int TOK_REVOKE=215;
    public static final int KW_TRUE=487;
    public static final int TOK_ALTERTABLE_PROPERTIES=120;
    public static final int KW_LIMIT=419;
    public static final int TOK_STREAMTABLE=201;
    public static final int KW_BIGINT=402;
    public static final int TOK_INT=77;
    public static final int KW_MINUS=496;
    public static final int TOK_TABLEFILEFORMAT=153;
    public static final int KW_RIGHT=436;
    public static final int TOK_ORDERBY=58;
    public static final int KW_EXTERNAL=276;
    public static final int KW_STATISTICS=356;
    public static final int KW_AFTER=320;
    public static final int TOK_PRIV_CREATE=232;
    public static final int KW_UNSET=325;
    public static final int TOK_JOIN=63;
    public static final int TOK_ALTERINDEX_PROPERTIES=123;
    public static final int TILDE=472;
    public static final int KW_COLUMN=318;
    public static final int KW_INDEX=305;
    public static final int DOT=347;
    public static final int TOK_DATABASEPROPERTIES=241;
    public static final int KW_UNDO=501;
    public static final int KW_STREAMTABLE=427;
    public static final int TOK_TAB=10;
    public static final int TOK_SHOW_TBLPROPERTIES=132;
    public static final int TOK_ROLLUP_GROUPBY=53;
    public static final int TOK_ALTERTABLE_SKEWED=254;
    public static final int TOK_ALTERDATABASE_PROPERTIES=244;
    public static final int KW_ROLLUP=448;
    public static final int TOK_DEFERRED_REBUILDINDEX=97;
    public static final int KW_DIRECTORIES=285;
    public static final int KW_TRIGGER=513;
    public static final int KW_CONTINUE=511;
    public static final int TOK_USERSCRIPTCOLSCHEMA=205;
    public static final int TOK_OP_BITOR=38;
    public static final int RSQUARE=470;
    public static final int TOK_PARTSPEC=11;
    public static final int TOK_SWITCHDATABASE=136;
    public static final int Digit=521;
    public static final int TOK_BOOLEAN=79;
    public static final int KW_UNSIGNED=503;
    public static final int KW_DATA=266;
    public static final int TOK_LIMIT=193;
    public static final int TOK_TABSORTCOLNAMEASC=171;
    public static final int KW_SHOW=358;
    public static final int KW_SKEWED=329;
    public static final int KW_DATE=406;
    public static final int BigintLiteral=463;
    public static final int KW_INTO=271;
    public static final int KW_OR=286;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=147;
    public static final int KW_VALUE_TYPE=350;
    public static final int KW_ON=306;
    public static final int KW_OF=443;
    public static final int KW_BETWEEN=485;
    public static final int TOK_OP_SUB=33;
    public static final int TOK_IMPORT=71;
    public HiveLexer() {;} 
    public HiveLexer(CharStream input) {
        super(input);
    }

    public String getGrammarFileName() { return "/home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g"; }

    // $ANTLR start KW_TRUE
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2383:9: ( 'TRUE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2383:11: 'TRUE'
            {
            match("TRUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRUE

    // $ANTLR start KW_FALSE
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2384:10: ( 'FALSE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2384:12: 'FALSE'
            {
            match("FALSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FALSE

    // $ANTLR start KW_ALL
    public final void mKW_ALL() throws RecognitionException {
        try {
            int _type = KW_ALL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2385:8: ( 'ALL' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2385:10: 'ALL'
            {
            match("ALL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ALL

    // $ANTLR start KW_AND
    public final void mKW_AND() throws RecognitionException {
        try {
            int _type = KW_AND;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2386:8: ( 'AND' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2386:10: 'AND'
            {
            match("AND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AND

    // $ANTLR start KW_OR
    public final void mKW_OR() throws RecognitionException {
        try {
            int _type = KW_OR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2387:7: ( 'OR' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2387:9: 'OR'
            {
            match("OR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OR

    // $ANTLR start KW_NOT
    public final void mKW_NOT() throws RecognitionException {
        try {
            int _type = KW_NOT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2388:8: ( 'NOT' | '!' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N') ) {
                alt1=1;
            }
            else if ( (LA1_0=='!') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2388:1: KW_NOT : ( 'NOT' | '!' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2388:10: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 2 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2388:18: '!'
                    {
                    match('!'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NOT

    // $ANTLR start KW_LIKE
    public final void mKW_LIKE() throws RecognitionException {
        try {
            int _type = KW_LIKE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2389:9: ( 'LIKE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2389:11: 'LIKE'
            {
            match("LIKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LIKE

    // $ANTLR start KW_IF
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2391:7: ( 'IF' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2391:9: 'IF'
            {
            match("IF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IF

    // $ANTLR start KW_EXISTS
    public final void mKW_EXISTS() throws RecognitionException {
        try {
            int _type = KW_EXISTS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2392:11: ( 'EXISTS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2392:13: 'EXISTS'
            {
            match("EXISTS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXISTS

    // $ANTLR start KW_ASC
    public final void mKW_ASC() throws RecognitionException {
        try {
            int _type = KW_ASC;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2394:8: ( 'ASC' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2394:10: 'ASC'
            {
            match("ASC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ASC

    // $ANTLR start KW_DESC
    public final void mKW_DESC() throws RecognitionException {
        try {
            int _type = KW_DESC;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2395:9: ( 'DESC' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2395:11: 'DESC'
            {
            match("DESC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DESC

    // $ANTLR start KW_ORDER
    public final void mKW_ORDER() throws RecognitionException {
        try {
            int _type = KW_ORDER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2396:10: ( 'ORDER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2396:12: 'ORDER'
            {
            match("ORDER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ORDER

    // $ANTLR start KW_GROUP
    public final void mKW_GROUP() throws RecognitionException {
        try {
            int _type = KW_GROUP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2397:10: ( 'GROUP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2397:12: 'GROUP'
            {
            match("GROUP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GROUP

    // $ANTLR start KW_BY
    public final void mKW_BY() throws RecognitionException {
        try {
            int _type = KW_BY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2398:7: ( 'BY' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2398:9: 'BY'
            {
            match("BY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BY

    // $ANTLR start KW_HAVING
    public final void mKW_HAVING() throws RecognitionException {
        try {
            int _type = KW_HAVING;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2399:11: ( 'HAVING' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2399:13: 'HAVING'
            {
            match("HAVING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_HAVING

    // $ANTLR start KW_WHERE
    public final void mKW_WHERE() throws RecognitionException {
        try {
            int _type = KW_WHERE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2400:10: ( 'WHERE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2400:12: 'WHERE'
            {
            match("WHERE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHERE

    // $ANTLR start KW_FROM
    public final void mKW_FROM() throws RecognitionException {
        try {
            int _type = KW_FROM;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2401:9: ( 'FROM' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2401:11: 'FROM'
            {
            match("FROM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FROM

    // $ANTLR start KW_AS
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2402:7: ( 'AS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2402:9: 'AS'
            {
            match("AS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AS

    // $ANTLR start KW_SELECT
    public final void mKW_SELECT() throws RecognitionException {
        try {
            int _type = KW_SELECT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2403:11: ( 'SELECT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2403:13: 'SELECT'
            {
            match("SELECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SELECT

    // $ANTLR start KW_DISTINCT
    public final void mKW_DISTINCT() throws RecognitionException {
        try {
            int _type = KW_DISTINCT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2404:13: ( 'DISTINCT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2404:15: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISTINCT

    // $ANTLR start KW_INSERT
    public final void mKW_INSERT() throws RecognitionException {
        try {
            int _type = KW_INSERT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2405:11: ( 'INSERT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2405:13: 'INSERT'
            {
            match("INSERT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INSERT

    // $ANTLR start KW_OVERWRITE
    public final void mKW_OVERWRITE() throws RecognitionException {
        try {
            int _type = KW_OVERWRITE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2406:14: ( 'OVERWRITE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2406:16: 'OVERWRITE'
            {
            match("OVERWRITE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OVERWRITE

    // $ANTLR start KW_OUTER
    public final void mKW_OUTER() throws RecognitionException {
        try {
            int _type = KW_OUTER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2407:10: ( 'OUTER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2407:12: 'OUTER'
            {
            match("OUTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTER

    // $ANTLR start KW_UNIQUEJOIN
    public final void mKW_UNIQUEJOIN() throws RecognitionException {
        try {
            int _type = KW_UNIQUEJOIN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2408:15: ( 'UNIQUEJOIN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2408:17: 'UNIQUEJOIN'
            {
            match("UNIQUEJOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNIQUEJOIN

    // $ANTLR start KW_PRESERVE
    public final void mKW_PRESERVE() throws RecognitionException {
        try {
            int _type = KW_PRESERVE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2409:13: ( 'PRESERVE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2409:15: 'PRESERVE'
            {
            match("PRESERVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PRESERVE

    // $ANTLR start KW_JOIN
    public final void mKW_JOIN() throws RecognitionException {
        try {
            int _type = KW_JOIN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2410:9: ( 'JOIN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2410:11: 'JOIN'
            {
            match("JOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_JOIN

    // $ANTLR start KW_LEFT
    public final void mKW_LEFT() throws RecognitionException {
        try {
            int _type = KW_LEFT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2411:9: ( 'LEFT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2411:11: 'LEFT'
            {
            match("LEFT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LEFT

    // $ANTLR start KW_RIGHT
    public final void mKW_RIGHT() throws RecognitionException {
        try {
            int _type = KW_RIGHT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2412:10: ( 'RIGHT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2412:12: 'RIGHT'
            {
            match("RIGHT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RIGHT

    // $ANTLR start KW_FULL
    public final void mKW_FULL() throws RecognitionException {
        try {
            int _type = KW_FULL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2413:9: ( 'FULL' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2413:11: 'FULL'
            {
            match("FULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FULL

    // $ANTLR start KW_ON
    public final void mKW_ON() throws RecognitionException {
        try {
            int _type = KW_ON;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2414:7: ( 'ON' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2414:9: 'ON'
            {
            match("ON"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ON

    // $ANTLR start KW_PARTITION
    public final void mKW_PARTITION() throws RecognitionException {
        try {
            int _type = KW_PARTITION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2415:14: ( 'PARTITION' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2415:16: 'PARTITION'
            {
            match("PARTITION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITION

    // $ANTLR start KW_PARTITIONS
    public final void mKW_PARTITIONS() throws RecognitionException {
        try {
            int _type = KW_PARTITIONS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2416:15: ( 'PARTITIONS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2416:17: 'PARTITIONS'
            {
            match("PARTITIONS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITIONS

    // $ANTLR start KW_TABLE
    public final void mKW_TABLE() throws RecognitionException {
        try {
            int _type = KW_TABLE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2417:9: ( 'TABLE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2417:11: 'TABLE'
            {
            match("TABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLE

    // $ANTLR start KW_TABLES
    public final void mKW_TABLES() throws RecognitionException {
        try {
            int _type = KW_TABLES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2418:10: ( 'TABLES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2418:12: 'TABLES'
            {
            match("TABLES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLES

    // $ANTLR start KW_COLUMNS
    public final void mKW_COLUMNS() throws RecognitionException {
        try {
            int _type = KW_COLUMNS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2419:11: ( 'COLUMNS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2419:13: 'COLUMNS'
            {
            match("COLUMNS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLUMNS

    // $ANTLR start KW_INDEX
    public final void mKW_INDEX() throws RecognitionException {
        try {
            int _type = KW_INDEX;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2420:9: ( 'INDEX' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2420:11: 'INDEX'
            {
            match("INDEX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INDEX

    // $ANTLR start KW_INDEXES
    public final void mKW_INDEXES() throws RecognitionException {
        try {
            int _type = KW_INDEXES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2421:11: ( 'INDEXES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2421:13: 'INDEXES'
            {
            match("INDEXES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INDEXES

    // $ANTLR start KW_REBUILD
    public final void mKW_REBUILD() throws RecognitionException {
        try {
            int _type = KW_REBUILD;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2422:11: ( 'REBUILD' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2422:13: 'REBUILD'
            {
            match("REBUILD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REBUILD

    // $ANTLR start KW_FUNCTIONS
    public final void mKW_FUNCTIONS() throws RecognitionException {
        try {
            int _type = KW_FUNCTIONS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2423:13: ( 'FUNCTIONS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2423:15: 'FUNCTIONS'
            {
            match("FUNCTIONS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FUNCTIONS

    // $ANTLR start KW_SHOW
    public final void mKW_SHOW() throws RecognitionException {
        try {
            int _type = KW_SHOW;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2424:8: ( 'SHOW' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2424:10: 'SHOW'
            {
            match("SHOW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SHOW

    // $ANTLR start KW_MSCK
    public final void mKW_MSCK() throws RecognitionException {
        try {
            int _type = KW_MSCK;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2425:8: ( 'MSCK' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2425:10: 'MSCK'
            {
            match("MSCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MSCK

    // $ANTLR start KW_REPAIR
    public final void mKW_REPAIR() throws RecognitionException {
        try {
            int _type = KW_REPAIR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2426:10: ( 'REPAIR' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2426:12: 'REPAIR'
            {
            match("REPAIR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REPAIR

    // $ANTLR start KW_DIRECTORY
    public final void mKW_DIRECTORY() throws RecognitionException {
        try {
            int _type = KW_DIRECTORY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2427:13: ( 'DIRECTORY' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2427:15: 'DIRECTORY'
            {
            match("DIRECTORY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DIRECTORY

    // $ANTLR start KW_LOCAL
    public final void mKW_LOCAL() throws RecognitionException {
        try {
            int _type = KW_LOCAL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2428:9: ( 'LOCAL' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2428:11: 'LOCAL'
            {
            match("LOCAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCAL

    // $ANTLR start KW_TRANSFORM
    public final void mKW_TRANSFORM() throws RecognitionException {
        try {
            int _type = KW_TRANSFORM;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2429:14: ( 'TRANSFORM' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2429:16: 'TRANSFORM'
            {
            match("TRANSFORM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRANSFORM

    // $ANTLR start KW_USING
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2430:9: ( 'USING' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2430:11: 'USING'
            {
            match("USING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_USING

    // $ANTLR start KW_CLUSTER
    public final void mKW_CLUSTER() throws RecognitionException {
        try {
            int _type = KW_CLUSTER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2431:11: ( 'CLUSTER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2431:13: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTER

    // $ANTLR start KW_DISTRIBUTE
    public final void mKW_DISTRIBUTE() throws RecognitionException {
        try {
            int _type = KW_DISTRIBUTE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2432:14: ( 'DISTRIBUTE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2432:16: 'DISTRIBUTE'
            {
            match("DISTRIBUTE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISTRIBUTE

    // $ANTLR start KW_SORT
    public final void mKW_SORT() throws RecognitionException {
        try {
            int _type = KW_SORT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2433:8: ( 'SORT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2433:10: 'SORT'
            {
            match("SORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SORT

    // $ANTLR start KW_UNION
    public final void mKW_UNION() throws RecognitionException {
        try {
            int _type = KW_UNION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2434:9: ( 'UNION' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2434:11: 'UNION'
            {
            match("UNION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNION

    // $ANTLR start KW_LOAD
    public final void mKW_LOAD() throws RecognitionException {
        try {
            int _type = KW_LOAD;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2435:8: ( 'LOAD' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2435:10: 'LOAD'
            {
            match("LOAD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOAD

    // $ANTLR start KW_EXPORT
    public final void mKW_EXPORT() throws RecognitionException {
        try {
            int _type = KW_EXPORT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2436:10: ( 'EXPORT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2436:12: 'EXPORT'
            {
            match("EXPORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXPORT

    // $ANTLR start KW_IMPORT
    public final void mKW_IMPORT() throws RecognitionException {
        try {
            int _type = KW_IMPORT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2437:10: ( 'IMPORT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2437:12: 'IMPORT'
            {
            match("IMPORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IMPORT

    // $ANTLR start KW_DATA
    public final void mKW_DATA() throws RecognitionException {
        try {
            int _type = KW_DATA;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2438:8: ( 'DATA' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2438:10: 'DATA'
            {
            match("DATA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATA

    // $ANTLR start KW_INPATH
    public final void mKW_INPATH() throws RecognitionException {
        try {
            int _type = KW_INPATH;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2439:10: ( 'INPATH' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2439:12: 'INPATH'
            {
            match("INPATH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPATH

    // $ANTLR start KW_IS
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2440:6: ( 'IS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2440:8: 'IS'
            {
            match("IS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IS

    // $ANTLR start KW_NULL
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2441:8: ( 'NULL' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2441:10: 'NULL'
            {
            match("NULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NULL

    // $ANTLR start KW_CREATE
    public final void mKW_CREATE() throws RecognitionException {
        try {
            int _type = KW_CREATE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2442:10: ( 'CREATE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2442:12: 'CREATE'
            {
            match("CREATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CREATE

    // $ANTLR start KW_EXTERNAL
    public final void mKW_EXTERNAL() throws RecognitionException {
        try {
            int _type = KW_EXTERNAL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2443:12: ( 'EXTERNAL' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2443:14: 'EXTERNAL'
            {
            match("EXTERNAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXTERNAL

    // $ANTLR start KW_ALTER
    public final void mKW_ALTER() throws RecognitionException {
        try {
            int _type = KW_ALTER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2444:9: ( 'ALTER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2444:11: 'ALTER'
            {
            match("ALTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ALTER

    // $ANTLR start KW_CHANGE
    public final void mKW_CHANGE() throws RecognitionException {
        try {
            int _type = KW_CHANGE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2445:10: ( 'CHANGE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2445:12: 'CHANGE'
            {
            match("CHANGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CHANGE

    // $ANTLR start KW_COLUMN
    public final void mKW_COLUMN() throws RecognitionException {
        try {
            int _type = KW_COLUMN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2446:10: ( 'COLUMN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2446:12: 'COLUMN'
            {
            match("COLUMN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLUMN

    // $ANTLR start KW_FIRST
    public final void mKW_FIRST() throws RecognitionException {
        try {
            int _type = KW_FIRST;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2447:9: ( 'FIRST' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2447:11: 'FIRST'
            {
            match("FIRST"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FIRST

    // $ANTLR start KW_AFTER
    public final void mKW_AFTER() throws RecognitionException {
        try {
            int _type = KW_AFTER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2448:9: ( 'AFTER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2448:11: 'AFTER'
            {
            match("AFTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AFTER

    // $ANTLR start KW_DESCRIBE
    public final void mKW_DESCRIBE() throws RecognitionException {
        try {
            int _type = KW_DESCRIBE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2449:12: ( 'DESCRIBE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2449:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DESCRIBE

    // $ANTLR start KW_DROP
    public final void mKW_DROP() throws RecognitionException {
        try {
            int _type = KW_DROP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2450:8: ( 'DROP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2450:10: 'DROP'
            {
            match("DROP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DROP

    // $ANTLR start KW_RENAME
    public final void mKW_RENAME() throws RecognitionException {
        try {
            int _type = KW_RENAME;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2451:10: ( 'RENAME' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2451:12: 'RENAME'
            {
            match("RENAME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RENAME

    // $ANTLR start KW_IGNORE
    public final void mKW_IGNORE() throws RecognitionException {
        try {
            int _type = KW_IGNORE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2452:10: ( 'IGNORE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2452:12: 'IGNORE'
            {
            match("IGNORE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IGNORE

    // $ANTLR start KW_PROTECTION
    public final void mKW_PROTECTION() throws RecognitionException {
        try {
            int _type = KW_PROTECTION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2453:14: ( 'PROTECTION' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2453:16: 'PROTECTION'
            {
            match("PROTECTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PROTECTION

    // $ANTLR start KW_TO
    public final void mKW_TO() throws RecognitionException {
        try {
            int _type = KW_TO;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2454:6: ( 'TO' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2454:8: 'TO'
            {
            match("TO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TO

    // $ANTLR start KW_COMMENT
    public final void mKW_COMMENT() throws RecognitionException {
        try {
            int _type = KW_COMMENT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2455:11: ( 'COMMENT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2455:13: 'COMMENT'
            {
            match("COMMENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COMMENT

    // $ANTLR start KW_BOOLEAN
    public final void mKW_BOOLEAN() throws RecognitionException {
        try {
            int _type = KW_BOOLEAN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2456:11: ( 'BOOLEAN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2456:13: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BOOLEAN

    // $ANTLR start KW_TINYINT
    public final void mKW_TINYINT() throws RecognitionException {
        try {
            int _type = KW_TINYINT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2457:11: ( 'TINYINT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2457:13: 'TINYINT'
            {
            match("TINYINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TINYINT

    // $ANTLR start KW_SMALLINT
    public final void mKW_SMALLINT() throws RecognitionException {
        try {
            int _type = KW_SMALLINT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2458:12: ( 'SMALLINT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2458:14: 'SMALLINT'
            {
            match("SMALLINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SMALLINT

    // $ANTLR start KW_INT
    public final void mKW_INT() throws RecognitionException {
        try {
            int _type = KW_INT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2459:7: ( 'INT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2459:9: 'INT'
            {
            match("INT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INT

    // $ANTLR start KW_BIGINT
    public final void mKW_BIGINT() throws RecognitionException {
        try {
            int _type = KW_BIGINT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2460:10: ( 'BIGINT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2460:12: 'BIGINT'
            {
            match("BIGINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BIGINT

    // $ANTLR start KW_FLOAT
    public final void mKW_FLOAT() throws RecognitionException {
        try {
            int _type = KW_FLOAT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2461:9: ( 'FLOAT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2461:11: 'FLOAT'
            {
            match("FLOAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FLOAT

    // $ANTLR start KW_DOUBLE
    public final void mKW_DOUBLE() throws RecognitionException {
        try {
            int _type = KW_DOUBLE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2462:10: ( 'DOUBLE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2462:12: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DOUBLE

    // $ANTLR start KW_DATE
    public final void mKW_DATE() throws RecognitionException {
        try {
            int _type = KW_DATE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2463:8: ( 'DATE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2463:10: 'DATE'
            {
            match("DATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATE

    // $ANTLR start KW_DATETIME
    public final void mKW_DATETIME() throws RecognitionException {
        try {
            int _type = KW_DATETIME;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2464:12: ( 'DATETIME' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2464:14: 'DATETIME'
            {
            match("DATETIME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATETIME

    // $ANTLR start KW_TIMESTAMP
    public final void mKW_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_TIMESTAMP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2465:13: ( 'TIMESTAMP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2465:15: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TIMESTAMP

    // $ANTLR start KW_STRING
    public final void mKW_STRING() throws RecognitionException {
        try {
            int _type = KW_STRING;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2466:10: ( 'STRING' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2466:12: 'STRING'
            {
            match("STRING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STRING

    // $ANTLR start KW_ARRAY
    public final void mKW_ARRAY() throws RecognitionException {
        try {
            int _type = KW_ARRAY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2467:9: ( 'ARRAY' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2467:11: 'ARRAY'
            {
            match("ARRAY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ARRAY

    // $ANTLR start KW_STRUCT
    public final void mKW_STRUCT() throws RecognitionException {
        try {
            int _type = KW_STRUCT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2468:10: ( 'STRUCT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2468:12: 'STRUCT'
            {
            match("STRUCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STRUCT

    // $ANTLR start KW_MAP
    public final void mKW_MAP() throws RecognitionException {
        try {
            int _type = KW_MAP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2469:7: ( 'MAP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2469:9: 'MAP'
            {
            match("MAP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MAP

    // $ANTLR start KW_UNIONTYPE
    public final void mKW_UNIONTYPE() throws RecognitionException {
        try {
            int _type = KW_UNIONTYPE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2470:13: ( 'UNIONTYPE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2470:15: 'UNIONTYPE'
            {
            match("UNIONTYPE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNIONTYPE

    // $ANTLR start KW_REDUCE
    public final void mKW_REDUCE() throws RecognitionException {
        try {
            int _type = KW_REDUCE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2471:10: ( 'REDUCE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2471:12: 'REDUCE'
            {
            match("REDUCE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REDUCE

    // $ANTLR start KW_PARTITIONED
    public final void mKW_PARTITIONED() throws RecognitionException {
        try {
            int _type = KW_PARTITIONED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2472:15: ( 'PARTITIONED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2472:17: 'PARTITIONED'
            {
            match("PARTITIONED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITIONED

    // $ANTLR start KW_CLUSTERED
    public final void mKW_CLUSTERED() throws RecognitionException {
        try {
            int _type = KW_CLUSTERED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2473:13: ( 'CLUSTERED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2473:15: 'CLUSTERED'
            {
            match("CLUSTERED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTERED

    // $ANTLR start KW_SORTED
    public final void mKW_SORTED() throws RecognitionException {
        try {
            int _type = KW_SORTED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2474:10: ( 'SORTED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2474:12: 'SORTED'
            {
            match("SORTED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SORTED

    // $ANTLR start KW_INTO
    public final void mKW_INTO() throws RecognitionException {
        try {
            int _type = KW_INTO;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2475:8: ( 'INTO' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2475:10: 'INTO'
            {
            match("INTO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTO

    // $ANTLR start KW_BUCKETS
    public final void mKW_BUCKETS() throws RecognitionException {
        try {
            int _type = KW_BUCKETS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2476:11: ( 'BUCKETS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2476:13: 'BUCKETS'
            {
            match("BUCKETS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BUCKETS

    // $ANTLR start KW_ROW
    public final void mKW_ROW() throws RecognitionException {
        try {
            int _type = KW_ROW;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2477:7: ( 'ROW' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2477:9: 'ROW'
            {
            match("ROW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROW

    // $ANTLR start KW_ROWS
    public final void mKW_ROWS() throws RecognitionException {
        try {
            int _type = KW_ROWS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2478:8: ( 'ROWS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2478:10: 'ROWS'
            {
            match("ROWS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROWS

    // $ANTLR start KW_FORMAT
    public final void mKW_FORMAT() throws RecognitionException {
        try {
            int _type = KW_FORMAT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2479:10: ( 'FORMAT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2479:12: 'FORMAT'
            {
            match("FORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FORMAT

    // $ANTLR start KW_DELIMITED
    public final void mKW_DELIMITED() throws RecognitionException {
        try {
            int _type = KW_DELIMITED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2480:13: ( 'DELIMITED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2480:15: 'DELIMITED'
            {
            match("DELIMITED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DELIMITED

    // $ANTLR start KW_FIELDS
    public final void mKW_FIELDS() throws RecognitionException {
        try {
            int _type = KW_FIELDS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2481:10: ( 'FIELDS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2481:12: 'FIELDS'
            {
            match("FIELDS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FIELDS

    // $ANTLR start KW_TERMINATED
    public final void mKW_TERMINATED() throws RecognitionException {
        try {
            int _type = KW_TERMINATED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2482:14: ( 'TERMINATED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2482:16: 'TERMINATED'
            {
            match("TERMINATED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TERMINATED

    // $ANTLR start KW_ESCAPED
    public final void mKW_ESCAPED() throws RecognitionException {
        try {
            int _type = KW_ESCAPED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2483:11: ( 'ESCAPED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2483:13: 'ESCAPED'
            {
            match("ESCAPED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ESCAPED

    // $ANTLR start KW_COLLECTION
    public final void mKW_COLLECTION() throws RecognitionException {
        try {
            int _type = KW_COLLECTION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2484:14: ( 'COLLECTION' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2484:16: 'COLLECTION'
            {
            match("COLLECTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLLECTION

    // $ANTLR start KW_ITEMS
    public final void mKW_ITEMS() throws RecognitionException {
        try {
            int _type = KW_ITEMS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2485:9: ( 'ITEMS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2485:11: 'ITEMS'
            {
            match("ITEMS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ITEMS

    // $ANTLR start KW_KEYS
    public final void mKW_KEYS() throws RecognitionException {
        try {
            int _type = KW_KEYS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2486:8: ( 'KEYS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2486:10: 'KEYS'
            {
            match("KEYS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_KEYS

    // $ANTLR start KW_KEY_TYPE
    public final void mKW_KEY_TYPE() throws RecognitionException {
        try {
            int _type = KW_KEY_TYPE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2487:12: ( '$KEY$' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2487:14: '$KEY$'
            {
            match("$KEY$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_KEY_TYPE

    // $ANTLR start KW_LINES
    public final void mKW_LINES() throws RecognitionException {
        try {
            int _type = KW_LINES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2488:9: ( 'LINES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2488:11: 'LINES'
            {
            match("LINES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LINES

    // $ANTLR start KW_STORED
    public final void mKW_STORED() throws RecognitionException {
        try {
            int _type = KW_STORED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2489:10: ( 'STORED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2489:12: 'STORED'
            {
            match("STORED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STORED

    // $ANTLR start KW_FILEFORMAT
    public final void mKW_FILEFORMAT() throws RecognitionException {
        try {
            int _type = KW_FILEFORMAT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2490:14: ( 'FILEFORMAT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2490:16: 'FILEFORMAT'
            {
            match("FILEFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FILEFORMAT

    // $ANTLR start KW_SEQUENCEFILE
    public final void mKW_SEQUENCEFILE() throws RecognitionException {
        try {
            int _type = KW_SEQUENCEFILE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2491:16: ( 'SEQUENCEFILE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2491:18: 'SEQUENCEFILE'
            {
            match("SEQUENCEFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SEQUENCEFILE

    // $ANTLR start KW_TEXTFILE
    public final void mKW_TEXTFILE() throws RecognitionException {
        try {
            int _type = KW_TEXTFILE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2492:12: ( 'TEXTFILE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2492:14: 'TEXTFILE'
            {
            match("TEXTFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TEXTFILE

    // $ANTLR start KW_RCFILE
    public final void mKW_RCFILE() throws RecognitionException {
        try {
            int _type = KW_RCFILE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2493:10: ( 'RCFILE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2493:12: 'RCFILE'
            {
            match("RCFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RCFILE

    // $ANTLR start KW_INPUTFORMAT
    public final void mKW_INPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_INPUTFORMAT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2494:15: ( 'INPUTFORMAT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2494:17: 'INPUTFORMAT'
            {
            match("INPUTFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPUTFORMAT

    // $ANTLR start KW_OUTPUTFORMAT
    public final void mKW_OUTPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_OUTPUTFORMAT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2495:16: ( 'OUTPUTFORMAT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2495:18: 'OUTPUTFORMAT'
            {
            match("OUTPUTFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTPUTFORMAT

    // $ANTLR start KW_INPUTDRIVER
    public final void mKW_INPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_INPUTDRIVER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2496:15: ( 'INPUTDRIVER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2496:17: 'INPUTDRIVER'
            {
            match("INPUTDRIVER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPUTDRIVER

    // $ANTLR start KW_OUTPUTDRIVER
    public final void mKW_OUTPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_OUTPUTDRIVER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2497:16: ( 'OUTPUTDRIVER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2497:18: 'OUTPUTDRIVER'
            {
            match("OUTPUTDRIVER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTPUTDRIVER

    // $ANTLR start KW_OFFLINE
    public final void mKW_OFFLINE() throws RecognitionException {
        try {
            int _type = KW_OFFLINE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2498:11: ( 'OFFLINE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2498:13: 'OFFLINE'
            {
            match("OFFLINE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OFFLINE

    // $ANTLR start KW_ENABLE
    public final void mKW_ENABLE() throws RecognitionException {
        try {
            int _type = KW_ENABLE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2499:10: ( 'ENABLE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2499:12: 'ENABLE'
            {
            match("ENABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ENABLE

    // $ANTLR start KW_DISABLE
    public final void mKW_DISABLE() throws RecognitionException {
        try {
            int _type = KW_DISABLE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2500:11: ( 'DISABLE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2500:13: 'DISABLE'
            {
            match("DISABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISABLE

    // $ANTLR start KW_READONLY
    public final void mKW_READONLY() throws RecognitionException {
        try {
            int _type = KW_READONLY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2501:12: ( 'READONLY' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2501:14: 'READONLY'
            {
            match("READONLY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READONLY

    // $ANTLR start KW_NO_DROP
    public final void mKW_NO_DROP() throws RecognitionException {
        try {
            int _type = KW_NO_DROP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2502:11: ( 'NO_DROP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2502:13: 'NO_DROP'
            {
            match("NO_DROP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NO_DROP

    // $ANTLR start KW_LOCATION
    public final void mKW_LOCATION() throws RecognitionException {
        try {
            int _type = KW_LOCATION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2503:12: ( 'LOCATION' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2503:14: 'LOCATION'
            {
            match("LOCATION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCATION

    // $ANTLR start KW_TABLESAMPLE
    public final void mKW_TABLESAMPLE() throws RecognitionException {
        try {
            int _type = KW_TABLESAMPLE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2504:15: ( 'TABLESAMPLE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2504:17: 'TABLESAMPLE'
            {
            match("TABLESAMPLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLESAMPLE

    // $ANTLR start KW_BUCKET
    public final void mKW_BUCKET() throws RecognitionException {
        try {
            int _type = KW_BUCKET;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2505:10: ( 'BUCKET' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2505:12: 'BUCKET'
            {
            match("BUCKET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BUCKET

    // $ANTLR start KW_OUT
    public final void mKW_OUT() throws RecognitionException {
        try {
            int _type = KW_OUT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2506:7: ( 'OUT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2506:9: 'OUT'
            {
            match("OUT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUT

    // $ANTLR start KW_OF
    public final void mKW_OF() throws RecognitionException {
        try {
            int _type = KW_OF;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2507:6: ( 'OF' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2507:8: 'OF'
            {
            match("OF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OF

    // $ANTLR start KW_PERCENT
    public final void mKW_PERCENT() throws RecognitionException {
        try {
            int _type = KW_PERCENT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2508:11: ( 'PERCENT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2508:13: 'PERCENT'
            {
            match("PERCENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PERCENT

    // $ANTLR start KW_CAST
    public final void mKW_CAST() throws RecognitionException {
        try {
            int _type = KW_CAST;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2509:8: ( 'CAST' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2509:10: 'CAST'
            {
            match("CAST"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CAST

    // $ANTLR start KW_ADD
    public final void mKW_ADD() throws RecognitionException {
        try {
            int _type = KW_ADD;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2510:7: ( 'ADD' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2510:9: 'ADD'
            {
            match("ADD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ADD

    // $ANTLR start KW_REPLACE
    public final void mKW_REPLACE() throws RecognitionException {
        try {
            int _type = KW_REPLACE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2511:11: ( 'REPLACE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2511:13: 'REPLACE'
            {
            match("REPLACE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REPLACE

    // $ANTLR start KW_RLIKE
    public final void mKW_RLIKE() throws RecognitionException {
        try {
            int _type = KW_RLIKE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2512:9: ( 'RLIKE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2512:11: 'RLIKE'
            {
            match("RLIKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RLIKE

    // $ANTLR start KW_REGEXP
    public final void mKW_REGEXP() throws RecognitionException {
        try {
            int _type = KW_REGEXP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2513:10: ( 'REGEXP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2513:12: 'REGEXP'
            {
            match("REGEXP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REGEXP

    // $ANTLR start KW_TEMPORARY
    public final void mKW_TEMPORARY() throws RecognitionException {
        try {
            int _type = KW_TEMPORARY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2514:13: ( 'TEMPORARY' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2514:15: 'TEMPORARY'
            {
            match("TEMPORARY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TEMPORARY

    // $ANTLR start KW_FUNCTION
    public final void mKW_FUNCTION() throws RecognitionException {
        try {
            int _type = KW_FUNCTION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2515:12: ( 'FUNCTION' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2515:14: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FUNCTION

    // $ANTLR start KW_EXPLAIN
    public final void mKW_EXPLAIN() throws RecognitionException {
        try {
            int _type = KW_EXPLAIN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2516:11: ( 'EXPLAIN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2516:13: 'EXPLAIN'
            {
            match("EXPLAIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXPLAIN

    // $ANTLR start KW_EXTENDED
    public final void mKW_EXTENDED() throws RecognitionException {
        try {
            int _type = KW_EXTENDED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2517:12: ( 'EXTENDED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2517:14: 'EXTENDED'
            {
            match("EXTENDED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXTENDED

    // $ANTLR start KW_FORMATTED
    public final void mKW_FORMATTED() throws RecognitionException {
        try {
            int _type = KW_FORMATTED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2518:13: ( 'FORMATTED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2518:15: 'FORMATTED'
            {
            match("FORMATTED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FORMATTED

    // $ANTLR start KW_DEPENDENCY
    public final void mKW_DEPENDENCY() throws RecognitionException {
        try {
            int _type = KW_DEPENDENCY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2519:14: ( 'DEPENDENCY' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2519:16: 'DEPENDENCY'
            {
            match("DEPENDENCY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DEPENDENCY

    // $ANTLR start KW_SERDE
    public final void mKW_SERDE() throws RecognitionException {
        try {
            int _type = KW_SERDE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2520:9: ( 'SERDE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2520:11: 'SERDE'
            {
            match("SERDE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SERDE

    // $ANTLR start KW_WITH
    public final void mKW_WITH() throws RecognitionException {
        try {
            int _type = KW_WITH;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2521:8: ( 'WITH' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2521:10: 'WITH'
            {
            match("WITH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WITH

    // $ANTLR start KW_DEFERRED
    public final void mKW_DEFERRED() throws RecognitionException {
        try {
            int _type = KW_DEFERRED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2522:12: ( 'DEFERRED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2522:14: 'DEFERRED'
            {
            match("DEFERRED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DEFERRED

    // $ANTLR start KW_SERDEPROPERTIES
    public final void mKW_SERDEPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_SERDEPROPERTIES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2523:19: ( 'SERDEPROPERTIES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2523:21: 'SERDEPROPERTIES'
            {
            match("SERDEPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SERDEPROPERTIES

    // $ANTLR start KW_DBPROPERTIES
    public final void mKW_DBPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_DBPROPERTIES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2524:16: ( 'DBPROPERTIES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2524:18: 'DBPROPERTIES'
            {
            match("DBPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DBPROPERTIES

    // $ANTLR start KW_LIMIT
    public final void mKW_LIMIT() throws RecognitionException {
        try {
            int _type = KW_LIMIT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2525:9: ( 'LIMIT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2525:11: 'LIMIT'
            {
            match("LIMIT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LIMIT

    // $ANTLR start KW_SET
    public final void mKW_SET() throws RecognitionException {
        try {
            int _type = KW_SET;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2526:7: ( 'SET' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2526:9: 'SET'
            {
            match("SET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SET

    // $ANTLR start KW_UNSET
    public final void mKW_UNSET() throws RecognitionException {
        try {
            int _type = KW_UNSET;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2527:9: ( 'UNSET' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2527:11: 'UNSET'
            {
            match("UNSET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNSET

    // $ANTLR start KW_TBLPROPERTIES
    public final void mKW_TBLPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_TBLPROPERTIES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2528:17: ( 'TBLPROPERTIES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2528:19: 'TBLPROPERTIES'
            {
            match("TBLPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TBLPROPERTIES

    // $ANTLR start KW_IDXPROPERTIES
    public final void mKW_IDXPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_IDXPROPERTIES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2529:17: ( 'IDXPROPERTIES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2529:19: 'IDXPROPERTIES'
            {
            match("IDXPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IDXPROPERTIES

    // $ANTLR start KW_VALUE_TYPE
    public final void mKW_VALUE_TYPE() throws RecognitionException {
        try {
            int _type = KW_VALUE_TYPE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2530:14: ( '$VALUE$' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2530:16: '$VALUE$'
            {
            match("$VALUE$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_VALUE_TYPE

    // $ANTLR start KW_ELEM_TYPE
    public final void mKW_ELEM_TYPE() throws RecognitionException {
        try {
            int _type = KW_ELEM_TYPE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2531:13: ( '$ELEM$' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2531:15: '$ELEM$'
            {
            match("$ELEM$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ELEM_TYPE

    // $ANTLR start KW_CASE
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2532:8: ( 'CASE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2532:10: 'CASE'
            {
            match("CASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CASE

    // $ANTLR start KW_WHEN
    public final void mKW_WHEN() throws RecognitionException {
        try {
            int _type = KW_WHEN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2533:8: ( 'WHEN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2533:10: 'WHEN'
            {
            match("WHEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHEN

    // $ANTLR start KW_THEN
    public final void mKW_THEN() throws RecognitionException {
        try {
            int _type = KW_THEN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2534:8: ( 'THEN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2534:10: 'THEN'
            {
            match("THEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_THEN

    // $ANTLR start KW_ELSE
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2535:8: ( 'ELSE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2535:10: 'ELSE'
            {
            match("ELSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ELSE

    // $ANTLR start KW_END
    public final void mKW_END() throws RecognitionException {
        try {
            int _type = KW_END;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2536:7: ( 'END' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2536:9: 'END'
            {
            match("END"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_END

    // $ANTLR start KW_MAPJOIN
    public final void mKW_MAPJOIN() throws RecognitionException {
        try {
            int _type = KW_MAPJOIN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2537:11: ( 'MAPJOIN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2537:13: 'MAPJOIN'
            {
            match("MAPJOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MAPJOIN

    // $ANTLR start KW_STREAMTABLE
    public final void mKW_STREAMTABLE() throws RecognitionException {
        try {
            int _type = KW_STREAMTABLE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2538:15: ( 'STREAMTABLE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2538:17: 'STREAMTABLE'
            {
            match("STREAMTABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STREAMTABLE

    // $ANTLR start KW_HOLD_DDLTIME
    public final void mKW_HOLD_DDLTIME() throws RecognitionException {
        try {
            int _type = KW_HOLD_DDLTIME;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2539:16: ( 'HOLD_DDLTIME' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2539:18: 'HOLD_DDLTIME'
            {
            match("HOLD_DDLTIME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_HOLD_DDLTIME

    // $ANTLR start KW_CLUSTERSTATUS
    public final void mKW_CLUSTERSTATUS() throws RecognitionException {
        try {
            int _type = KW_CLUSTERSTATUS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2540:17: ( 'CLUSTERSTATUS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2540:19: 'CLUSTERSTATUS'
            {
            match("CLUSTERSTATUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTERSTATUS

    // $ANTLR start KW_UTC
    public final void mKW_UTC() throws RecognitionException {
        try {
            int _type = KW_UTC;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2541:7: ( 'UTC' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2541:9: 'UTC'
            {
            match("UTC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UTC

    // $ANTLR start KW_UTCTIMESTAMP
    public final void mKW_UTCTIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_UTCTIMESTAMP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2542:16: ( 'UTC_TMESTAMP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2542:18: 'UTC_TMESTAMP'
            {
            match("UTC_TMESTAMP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UTCTIMESTAMP

    // $ANTLR start KW_LONG
    public final void mKW_LONG() throws RecognitionException {
        try {
            int _type = KW_LONG;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2543:8: ( 'LONG' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2543:10: 'LONG'
            {
            match("LONG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LONG

    // $ANTLR start KW_DELETE
    public final void mKW_DELETE() throws RecognitionException {
        try {
            int _type = KW_DELETE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2544:10: ( 'DELETE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2544:12: 'DELETE'
            {
            match("DELETE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DELETE

    // $ANTLR start KW_PLUS
    public final void mKW_PLUS() throws RecognitionException {
        try {
            int _type = KW_PLUS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2545:8: ( 'PLUS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2545:10: 'PLUS'
            {
            match("PLUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PLUS

    // $ANTLR start KW_MINUS
    public final void mKW_MINUS() throws RecognitionException {
        try {
            int _type = KW_MINUS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2546:9: ( 'MINUS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2546:11: 'MINUS'
            {
            match("MINUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MINUS

    // $ANTLR start KW_FETCH
    public final void mKW_FETCH() throws RecognitionException {
        try {
            int _type = KW_FETCH;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2547:9: ( 'FETCH' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2547:11: 'FETCH'
            {
            match("FETCH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FETCH

    // $ANTLR start KW_INTERSECT
    public final void mKW_INTERSECT() throws RecognitionException {
        try {
            int _type = KW_INTERSECT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2548:13: ( 'INTERSECT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2548:15: 'INTERSECT'
            {
            match("INTERSECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTERSECT

    // $ANTLR start KW_VIEW
    public final void mKW_VIEW() throws RecognitionException {
        try {
            int _type = KW_VIEW;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2549:8: ( 'VIEW' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2549:10: 'VIEW'
            {
            match("VIEW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_VIEW

    // $ANTLR start KW_IN
    public final void mKW_IN() throws RecognitionException {
        try {
            int _type = KW_IN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2550:6: ( 'IN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2550:8: 'IN'
            {
            match("IN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IN

    // $ANTLR start KW_DATABASE
    public final void mKW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_DATABASE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2551:12: ( 'DATABASE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2551:14: 'DATABASE'
            {
            match("DATABASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATABASE

    // $ANTLR start KW_DATABASES
    public final void mKW_DATABASES() throws RecognitionException {
        try {
            int _type = KW_DATABASES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2552:13: ( 'DATABASES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2552:15: 'DATABASES'
            {
            match("DATABASES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATABASES

    // $ANTLR start KW_MATERIALIZED
    public final void mKW_MATERIALIZED() throws RecognitionException {
        try {
            int _type = KW_MATERIALIZED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2553:16: ( 'MATERIALIZED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2553:18: 'MATERIALIZED'
            {
            match("MATERIALIZED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MATERIALIZED

    // $ANTLR start KW_SCHEMA
    public final void mKW_SCHEMA() throws RecognitionException {
        try {
            int _type = KW_SCHEMA;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2554:10: ( 'SCHEMA' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2554:12: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SCHEMA

    // $ANTLR start KW_SCHEMAS
    public final void mKW_SCHEMAS() throws RecognitionException {
        try {
            int _type = KW_SCHEMAS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2555:11: ( 'SCHEMAS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2555:13: 'SCHEMAS'
            {
            match("SCHEMAS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SCHEMAS

    // $ANTLR start KW_GRANT
    public final void mKW_GRANT() throws RecognitionException {
        try {
            int _type = KW_GRANT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2556:9: ( 'GRANT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2556:11: 'GRANT'
            {
            match("GRANT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GRANT

    // $ANTLR start KW_REVOKE
    public final void mKW_REVOKE() throws RecognitionException {
        try {
            int _type = KW_REVOKE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2557:10: ( 'REVOKE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2557:12: 'REVOKE'
            {
            match("REVOKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REVOKE

    // $ANTLR start KW_SSL
    public final void mKW_SSL() throws RecognitionException {
        try {
            int _type = KW_SSL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2558:7: ( 'SSL' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2558:9: 'SSL'
            {
            match("SSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SSL

    // $ANTLR start KW_UNDO
    public final void mKW_UNDO() throws RecognitionException {
        try {
            int _type = KW_UNDO;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2559:8: ( 'UNDO' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2559:10: 'UNDO'
            {
            match("UNDO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNDO

    // $ANTLR start KW_LOCK
    public final void mKW_LOCK() throws RecognitionException {
        try {
            int _type = KW_LOCK;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2560:8: ( 'LOCK' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2560:10: 'LOCK'
            {
            match("LOCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCK

    // $ANTLR start KW_LOCKS
    public final void mKW_LOCKS() throws RecognitionException {
        try {
            int _type = KW_LOCKS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2561:9: ( 'LOCKS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2561:11: 'LOCKS'
            {
            match("LOCKS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCKS

    // $ANTLR start KW_UNLOCK
    public final void mKW_UNLOCK() throws RecognitionException {
        try {
            int _type = KW_UNLOCK;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2562:10: ( 'UNLOCK' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2562:12: 'UNLOCK'
            {
            match("UNLOCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNLOCK

    // $ANTLR start KW_SHARED
    public final void mKW_SHARED() throws RecognitionException {
        try {
            int _type = KW_SHARED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2563:10: ( 'SHARED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2563:12: 'SHARED'
            {
            match("SHARED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SHARED

    // $ANTLR start KW_EXCLUSIVE
    public final void mKW_EXCLUSIVE() throws RecognitionException {
        try {
            int _type = KW_EXCLUSIVE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2564:13: ( 'EXCLUSIVE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2564:15: 'EXCLUSIVE'
            {
            match("EXCLUSIVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXCLUSIVE

    // $ANTLR start KW_PROCEDURE
    public final void mKW_PROCEDURE() throws RecognitionException {
        try {
            int _type = KW_PROCEDURE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2565:13: ( 'PROCEDURE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2565:15: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PROCEDURE

    // $ANTLR start KW_UNSIGNED
    public final void mKW_UNSIGNED() throws RecognitionException {
        try {
            int _type = KW_UNSIGNED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2566:12: ( 'UNSIGNED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2566:14: 'UNSIGNED'
            {
            match("UNSIGNED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNSIGNED

    // $ANTLR start KW_WHILE
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2567:9: ( 'WHILE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2567:11: 'WHILE'
            {
            match("WHILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHILE

    // $ANTLR start KW_READ
    public final void mKW_READ() throws RecognitionException {
        try {
            int _type = KW_READ;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2568:8: ( 'READ' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2568:10: 'READ'
            {
            match("READ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READ

    // $ANTLR start KW_READS
    public final void mKW_READS() throws RecognitionException {
        try {
            int _type = KW_READS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2569:9: ( 'READS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2569:11: 'READS'
            {
            match("READS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READS

    // $ANTLR start KW_PURGE
    public final void mKW_PURGE() throws RecognitionException {
        try {
            int _type = KW_PURGE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2570:9: ( 'PURGE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2570:11: 'PURGE'
            {
            match("PURGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PURGE

    // $ANTLR start KW_RANGE
    public final void mKW_RANGE() throws RecognitionException {
        try {
            int _type = KW_RANGE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2571:9: ( 'RANGE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2571:11: 'RANGE'
            {
            match("RANGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RANGE

    // $ANTLR start KW_ANALYZE
    public final void mKW_ANALYZE() throws RecognitionException {
        try {
            int _type = KW_ANALYZE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2572:11: ( 'ANALYZE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2572:13: 'ANALYZE'
            {
            match("ANALYZE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ANALYZE

    // $ANTLR start KW_BEFORE
    public final void mKW_BEFORE() throws RecognitionException {
        try {
            int _type = KW_BEFORE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2573:10: ( 'BEFORE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2573:12: 'BEFORE'
            {
            match("BEFORE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BEFORE

    // $ANTLR start KW_BETWEEN
    public final void mKW_BETWEEN() throws RecognitionException {
        try {
            int _type = KW_BETWEEN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2574:11: ( 'BETWEEN' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2574:13: 'BETWEEN'
            {
            match("BETWEEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BETWEEN

    // $ANTLR start KW_BOTH
    public final void mKW_BOTH() throws RecognitionException {
        try {
            int _type = KW_BOTH;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2575:8: ( 'BOTH' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2575:10: 'BOTH'
            {
            match("BOTH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BOTH

    // $ANTLR start KW_BINARY
    public final void mKW_BINARY() throws RecognitionException {
        try {
            int _type = KW_BINARY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2576:10: ( 'BINARY' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2576:12: 'BINARY'
            {
            match("BINARY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BINARY

    // $ANTLR start KW_CROSS
    public final void mKW_CROSS() throws RecognitionException {
        try {
            int _type = KW_CROSS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2577:9: ( 'CROSS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2577:11: 'CROSS'
            {
            match("CROSS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CROSS

    // $ANTLR start KW_CONTINUE
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2578:12: ( 'CONTINUE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2578:14: 'CONTINUE'
            {
            match("CONTINUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CONTINUE

    // $ANTLR start KW_CURSOR
    public final void mKW_CURSOR() throws RecognitionException {
        try {
            int _type = KW_CURSOR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2579:10: ( 'CURSOR' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2579:12: 'CURSOR'
            {
            match("CURSOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CURSOR

    // $ANTLR start KW_TRIGGER
    public final void mKW_TRIGGER() throws RecognitionException {
        try {
            int _type = KW_TRIGGER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2580:11: ( 'TRIGGER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2580:13: 'TRIGGER'
            {
            match("TRIGGER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRIGGER

    // $ANTLR start KW_RECORDREADER
    public final void mKW_RECORDREADER() throws RecognitionException {
        try {
            int _type = KW_RECORDREADER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2581:16: ( 'RECORDREADER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2581:18: 'RECORDREADER'
            {
            match("RECORDREADER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RECORDREADER

    // $ANTLR start KW_RECORDWRITER
    public final void mKW_RECORDWRITER() throws RecognitionException {
        try {
            int _type = KW_RECORDWRITER;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2582:16: ( 'RECORDWRITER' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2582:18: 'RECORDWRITER'
            {
            match("RECORDWRITER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RECORDWRITER

    // $ANTLR start KW_SEMI
    public final void mKW_SEMI() throws RecognitionException {
        try {
            int _type = KW_SEMI;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2583:8: ( 'SEMI' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2583:10: 'SEMI'
            {
            match("SEMI"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SEMI

    // $ANTLR start KW_LATERAL
    public final void mKW_LATERAL() throws RecognitionException {
        try {
            int _type = KW_LATERAL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2584:11: ( 'LATERAL' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2584:13: 'LATERAL'
            {
            match("LATERAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LATERAL

    // $ANTLR start KW_TOUCH
    public final void mKW_TOUCH() throws RecognitionException {
        try {
            int _type = KW_TOUCH;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2585:9: ( 'TOUCH' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2585:11: 'TOUCH'
            {
            match("TOUCH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TOUCH

    // $ANTLR start KW_ARCHIVE
    public final void mKW_ARCHIVE() throws RecognitionException {
        try {
            int _type = KW_ARCHIVE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2586:11: ( 'ARCHIVE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2586:13: 'ARCHIVE'
            {
            match("ARCHIVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ARCHIVE

    // $ANTLR start KW_UNARCHIVE
    public final void mKW_UNARCHIVE() throws RecognitionException {
        try {
            int _type = KW_UNARCHIVE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2587:13: ( 'UNARCHIVE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2587:15: 'UNARCHIVE'
            {
            match("UNARCHIVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNARCHIVE

    // $ANTLR start KW_COMPUTE
    public final void mKW_COMPUTE() throws RecognitionException {
        try {
            int _type = KW_COMPUTE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2588:11: ( 'COMPUTE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2588:13: 'COMPUTE'
            {
            match("COMPUTE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COMPUTE

    // $ANTLR start KW_STATISTICS
    public final void mKW_STATISTICS() throws RecognitionException {
        try {
            int _type = KW_STATISTICS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2589:14: ( 'STATISTICS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2589:16: 'STATISTICS'
            {
            match("STATISTICS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STATISTICS

    // $ANTLR start KW_USE
    public final void mKW_USE() throws RecognitionException {
        try {
            int _type = KW_USE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2590:7: ( 'USE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2590:9: 'USE'
            {
            match("USE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_USE

    // $ANTLR start KW_OPTION
    public final void mKW_OPTION() throws RecognitionException {
        try {
            int _type = KW_OPTION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2591:10: ( 'OPTION' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2591:12: 'OPTION'
            {
            match("OPTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OPTION

    // $ANTLR start KW_CONCATENATE
    public final void mKW_CONCATENATE() throws RecognitionException {
        try {
            int _type = KW_CONCATENATE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2592:15: ( 'CONCATENATE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2592:17: 'CONCATENATE'
            {
            match("CONCATENATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CONCATENATE

    // $ANTLR start KW_SHOW_DATABASE
    public final void mKW_SHOW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_SHOW_DATABASE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2593:17: ( 'SHOW_DATABASE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2593:19: 'SHOW_DATABASE'
            {
            match("SHOW_DATABASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SHOW_DATABASE

    // $ANTLR start KW_UPDATE
    public final void mKW_UPDATE() throws RecognitionException {
        try {
            int _type = KW_UPDATE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2594:10: ( 'UPDATE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2594:12: 'UPDATE'
            {
            match("UPDATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UPDATE

    // $ANTLR start KW_RESTRICT
    public final void mKW_RESTRICT() throws RecognitionException {
        try {
            int _type = KW_RESTRICT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2595:12: ( 'RESTRICT' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2595:14: 'RESTRICT'
            {
            match("RESTRICT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RESTRICT

    // $ANTLR start KW_CASCADE
    public final void mKW_CASCADE() throws RecognitionException {
        try {
            int _type = KW_CASCADE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2596:11: ( 'CASCADE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2596:13: 'CASCADE'
            {
            match("CASCADE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CASCADE

    // $ANTLR start KW_SKEWED
    public final void mKW_SKEWED() throws RecognitionException {
        try {
            int _type = KW_SKEWED;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2597:10: ( 'SKEWED' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2597:12: 'SKEWED'
            {
            match("SKEWED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SKEWED

    // $ANTLR start KW_ROLLUP
    public final void mKW_ROLLUP() throws RecognitionException {
        try {
            int _type = KW_ROLLUP;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2598:10: ( 'ROLLUP' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2598:12: 'ROLLUP'
            {
            match("ROLLUP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROLLUP

    // $ANTLR start KW_CUBE
    public final void mKW_CUBE() throws RecognitionException {
        try {
            int _type = KW_CUBE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2599:8: ( 'CUBE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2599:10: 'CUBE'
            {
            match("CUBE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CUBE

    // $ANTLR start KW_DIRECTORIES
    public final void mKW_DIRECTORIES() throws RecognitionException {
        try {
            int _type = KW_DIRECTORIES;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2600:15: ( 'DIRECTORIES' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2600:17: 'DIRECTORIES'
            {
            match("DIRECTORIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DIRECTORIES

    // $ANTLR start KW_FOR
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2601:7: ( 'FOR' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2601:9: 'FOR'
            {
            match("FOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FOR

    // $ANTLR start KW_GROUPING
    public final void mKW_GROUPING() throws RecognitionException {
        try {
            int _type = KW_GROUPING;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2602:12: ( 'GROUPING' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2602:14: 'GROUPING'
            {
            match("GROUPING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GROUPING

    // $ANTLR start KW_SETS
    public final void mKW_SETS() throws RecognitionException {
        try {
            int _type = KW_SETS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2603:8: ( 'SETS' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2603:10: 'SETS'
            {
            match("SETS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SETS

    // $ANTLR start KW_TRUNCATE
    public final void mKW_TRUNCATE() throws RecognitionException {
        try {
            int _type = KW_TRUNCATE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2604:12: ( 'TRUNCATE' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2604:14: 'TRUNCATE'
            {
            match("TRUNCATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRUNCATE

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2609:5: ( '.' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2609:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2610:7: ( ':' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2610:9: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2611:7: ( ',' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2611:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start SEMICOLON
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2612:11: ( ';' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2612:13: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMICOLON

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2614:8: ( '(' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2614:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2615:8: ( ')' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2615:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LSQUARE
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2616:9: ( '[' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2616:11: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LSQUARE

    // $ANTLR start RSQUARE
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2617:9: ( ']' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2617:11: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSQUARE

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2618:8: ( '{' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2618:10: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2619:8: ( '}' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2619:10: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2621:7: ( '=' | '==' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='=') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=2;
                }
                else {
                    alt2=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2621:1: EQUAL : ( '=' | '==' );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2621:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2621:15: '=='
                    {
                    match("=="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start EQUAL_NS
    public final void mEQUAL_NS() throws RecognitionException {
        try {
            int _type = EQUAL_NS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2622:10: ( '<=>' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2622:12: '<=>'
            {
            match("<=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL_NS

    // $ANTLR start NOTEQUAL
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2623:10: ( '<>' | '!=' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                alt3=1;
            }
            else if ( (LA3_0=='!') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2623:1: NOTEQUAL : ( '<>' | '!=' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2623:12: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2623:19: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOTEQUAL

    // $ANTLR start LESSTHANOREQUALTO
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2624:19: ( '<=' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2624:21: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHANOREQUALTO

    // $ANTLR start LESSTHAN
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2625:10: ( '<' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2625:12: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHAN

    // $ANTLR start GREATERTHANOREQUALTO
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2626:22: ( '>=' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2626:24: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHANOREQUALTO

    // $ANTLR start GREATERTHAN
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2627:13: ( '>' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2627:15: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHAN

    // $ANTLR start DIVIDE
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2629:8: ( '/' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2629:10: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVIDE

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2630:6: ( '+' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2630:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2631:7: ( '-' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2631:9: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2632:6: ( '*' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2632:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2633:5: ( '%' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2633:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2634:5: ( 'DIV' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2634:7: 'DIV'
            {
            match("DIV"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start AMPERSAND
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2636:11: ( '&' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2636:13: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AMPERSAND

    // $ANTLR start TILDE
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2637:7: ( '~' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2637:9: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TILDE

    // $ANTLR start BITWISEOR
    public final void mBITWISEOR() throws RecognitionException {
        try {
            int _type = BITWISEOR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2638:11: ( '|' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2638:13: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEOR

    // $ANTLR start BITWISEXOR
    public final void mBITWISEXOR() throws RecognitionException {
        try {
            int _type = BITWISEXOR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2639:12: ( '^' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2639:14: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEXOR

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2640:10: ( '?' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2640:12: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start DOLLAR
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2641:8: ( '$' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2641:10: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOLLAR

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2646:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2651:5: ( 'a' .. 'f' | 'A' .. 'F' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2656:5: ( '0' .. '9' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2657:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2662:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2663:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2663:17: ( PLUS | MINUS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2663:33: ( Digit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2663:34: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start RegexComponent
    public final void mRegexComponent() throws RecognitionException {
        try {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2668:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='(' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='}') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end RegexComponent

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2675:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    alt8=1;
                }
                else if ( (LA8_0=='\"') ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
            	    {
            	    match('\''); 
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop6:
            	    do {
            	        int alt6=3;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_0=='\\') ) {
            	            alt6=2;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:14: ~ ( '\\'' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:29: ( '\\\\' . )
            	    	    {
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:29: ( '\\\\' . )
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2676:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2677:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
            	    {
            	    match('\"'); 
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2677:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop7:
            	    do {
            	        int alt7=3;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
            	            alt7=1;
            	        }
            	        else if ( (LA7_0=='\\') ) {
            	            alt7=2;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2677:14: ~ ( '\\\"' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2677:29: ( '\\\\' . )
            	    	    {
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2677:29: ( '\\\\' . )
            	    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2677:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start CharSetLiteral
    public final void mCharSetLiteral() throws RecognitionException {
        try {
            int _type = CharSetLiteral;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2682:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"'||LA10_0=='\'') ) {
                alt10=1;
            }
            else if ( (LA10_0=='0') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2681:1: CharSetLiteral : ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2683:5: StringLiteral
                    {
                    mStringLiteral(); 

                    }
                    break;
                case 2 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2684:7: '0' 'X' ( HexDigit | Digit )+
                    {
                    match('0'); 
                    match('X'); 
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2684:15: ( HexDigit | Digit )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetLiteral

    // $ANTLR start BigintLiteral
    public final void mBigintLiteral() throws RecognitionException {
        try {
            int _type = BigintLiteral;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2688:5: ( ( Digit )+ 'L' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2689:5: ( Digit )+ 'L'
            {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2689:5: ( Digit )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2689:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            match('L'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BigintLiteral

    // $ANTLR start SmallintLiteral
    public final void mSmallintLiteral() throws RecognitionException {
        try {
            int _type = SmallintLiteral;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2693:5: ( ( Digit )+ 'S' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2694:5: ( Digit )+ 'S'
            {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2694:5: ( Digit )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2694:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match('S'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SmallintLiteral

    // $ANTLR start TinyintLiteral
    public final void mTinyintLiteral() throws RecognitionException {
        try {
            int _type = TinyintLiteral;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2698:5: ( ( Digit )+ 'Y' )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2699:5: ( Digit )+ 'Y'
            {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2699:5: ( Digit )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2699:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match('Y'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TinyintLiteral

    // $ANTLR start ByteLengthLiteral
    public final void mByteLengthLiteral() throws RecognitionException {
        try {
            int _type = ByteLengthLiteral;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2703:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2704:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
            {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2704:5: ( Digit )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2704:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ByteLengthLiteral

    // $ANTLR start Number
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2708:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
            {
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:5: ( Digit )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='.') ) {
                alt18=1;
            }
            else if ( (LA18_0=='E'||LA18_0=='e') ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:16: DOT ( Digit )* ( Exponent )?
                    {
                    mDOT(); 
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:20: ( Digit )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:21: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:29: ( Exponent )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:30: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2709:43: Exponent
                    {
                    mExponent(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Number

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2713:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||(LA21_0>='a' && LA21_0<='z')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='`') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2712:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2714:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2714:22: ( Letter | Digit | '_' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2715:7: '`' ( RegexComponent )+ '`'
                    {
                    match('`'); 
                    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2715:11: ( RegexComponent )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='$'||(LA20_0>='(' && LA20_0<='+')||(LA20_0>='-' && LA20_0<='.')||(LA20_0>='0' && LA20_0<='9')||LA20_0=='?'||(LA20_0>='A' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='_')||(LA20_0>='a' && LA20_0<='}')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2715:11: RegexComponent
                    	    {
                    	    mRegexComponent(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    match('`'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Identifier

    // $ANTLR start CharSetName
    public final void mCharSetName() throws RecognitionException {
        try {
            int _type = CharSetName;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2719:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2720:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
            {
            match('_'); 
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2720:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='-' && LA22_0<='.')||(LA22_0>='0' && LA22_0<=':')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetName

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2723:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2723:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2727:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2727:5: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); 

            // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2727:10: (~ ( '\\n' | '\\r' ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFE')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:2727:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_STRING | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_DEPENDENCY | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT )
        int alt24=260;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:10: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 2 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:18: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 3 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:27: KW_ALL
                {
                mKW_ALL(); 

                }
                break;
            case 4 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:34: KW_AND
                {
                mKW_AND(); 

                }
                break;
            case 5 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:41: KW_OR
                {
                mKW_OR(); 

                }
                break;
            case 6 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:47: KW_NOT
                {
                mKW_NOT(); 

                }
                break;
            case 7 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:54: KW_LIKE
                {
                mKW_LIKE(); 

                }
                break;
            case 8 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:62: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 9 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:68: KW_EXISTS
                {
                mKW_EXISTS(); 

                }
                break;
            case 10 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:78: KW_ASC
                {
                mKW_ASC(); 

                }
                break;
            case 11 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:85: KW_DESC
                {
                mKW_DESC(); 

                }
                break;
            case 12 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:93: KW_ORDER
                {
                mKW_ORDER(); 

                }
                break;
            case 13 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:102: KW_GROUP
                {
                mKW_GROUP(); 

                }
                break;
            case 14 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:111: KW_BY
                {
                mKW_BY(); 

                }
                break;
            case 15 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:117: KW_HAVING
                {
                mKW_HAVING(); 

                }
                break;
            case 16 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:127: KW_WHERE
                {
                mKW_WHERE(); 

                }
                break;
            case 17 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:136: KW_FROM
                {
                mKW_FROM(); 

                }
                break;
            case 18 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:144: KW_AS
                {
                mKW_AS(); 

                }
                break;
            case 19 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:150: KW_SELECT
                {
                mKW_SELECT(); 

                }
                break;
            case 20 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:160: KW_DISTINCT
                {
                mKW_DISTINCT(); 

                }
                break;
            case 21 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:172: KW_INSERT
                {
                mKW_INSERT(); 

                }
                break;
            case 22 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:182: KW_OVERWRITE
                {
                mKW_OVERWRITE(); 

                }
                break;
            case 23 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:195: KW_OUTER
                {
                mKW_OUTER(); 

                }
                break;
            case 24 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:204: KW_UNIQUEJOIN
                {
                mKW_UNIQUEJOIN(); 

                }
                break;
            case 25 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:218: KW_PRESERVE
                {
                mKW_PRESERVE(); 

                }
                break;
            case 26 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:230: KW_JOIN
                {
                mKW_JOIN(); 

                }
                break;
            case 27 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:238: KW_LEFT
                {
                mKW_LEFT(); 

                }
                break;
            case 28 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:246: KW_RIGHT
                {
                mKW_RIGHT(); 

                }
                break;
            case 29 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:255: KW_FULL
                {
                mKW_FULL(); 

                }
                break;
            case 30 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:263: KW_ON
                {
                mKW_ON(); 

                }
                break;
            case 31 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:269: KW_PARTITION
                {
                mKW_PARTITION(); 

                }
                break;
            case 32 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:282: KW_PARTITIONS
                {
                mKW_PARTITIONS(); 

                }
                break;
            case 33 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:296: KW_TABLE
                {
                mKW_TABLE(); 

                }
                break;
            case 34 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:305: KW_TABLES
                {
                mKW_TABLES(); 

                }
                break;
            case 35 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:315: KW_COLUMNS
                {
                mKW_COLUMNS(); 

                }
                break;
            case 36 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:326: KW_INDEX
                {
                mKW_INDEX(); 

                }
                break;
            case 37 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:335: KW_INDEXES
                {
                mKW_INDEXES(); 

                }
                break;
            case 38 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:346: KW_REBUILD
                {
                mKW_REBUILD(); 

                }
                break;
            case 39 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:357: KW_FUNCTIONS
                {
                mKW_FUNCTIONS(); 

                }
                break;
            case 40 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:370: KW_SHOW
                {
                mKW_SHOW(); 

                }
                break;
            case 41 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:378: KW_MSCK
                {
                mKW_MSCK(); 

                }
                break;
            case 42 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:386: KW_REPAIR
                {
                mKW_REPAIR(); 

                }
                break;
            case 43 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:396: KW_DIRECTORY
                {
                mKW_DIRECTORY(); 

                }
                break;
            case 44 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:409: KW_LOCAL
                {
                mKW_LOCAL(); 

                }
                break;
            case 45 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:418: KW_TRANSFORM
                {
                mKW_TRANSFORM(); 

                }
                break;
            case 46 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:431: KW_USING
                {
                mKW_USING(); 

                }
                break;
            case 47 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:440: KW_CLUSTER
                {
                mKW_CLUSTER(); 

                }
                break;
            case 48 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:451: KW_DISTRIBUTE
                {
                mKW_DISTRIBUTE(); 

                }
                break;
            case 49 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:465: KW_SORT
                {
                mKW_SORT(); 

                }
                break;
            case 50 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:473: KW_UNION
                {
                mKW_UNION(); 

                }
                break;
            case 51 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:482: KW_LOAD
                {
                mKW_LOAD(); 

                }
                break;
            case 52 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:490: KW_EXPORT
                {
                mKW_EXPORT(); 

                }
                break;
            case 53 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:500: KW_IMPORT
                {
                mKW_IMPORT(); 

                }
                break;
            case 54 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:510: KW_DATA
                {
                mKW_DATA(); 

                }
                break;
            case 55 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:518: KW_INPATH
                {
                mKW_INPATH(); 

                }
                break;
            case 56 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:528: KW_IS
                {
                mKW_IS(); 

                }
                break;
            case 57 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:534: KW_NULL
                {
                mKW_NULL(); 

                }
                break;
            case 58 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:542: KW_CREATE
                {
                mKW_CREATE(); 

                }
                break;
            case 59 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:552: KW_EXTERNAL
                {
                mKW_EXTERNAL(); 

                }
                break;
            case 60 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:564: KW_ALTER
                {
                mKW_ALTER(); 

                }
                break;
            case 61 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:573: KW_CHANGE
                {
                mKW_CHANGE(); 

                }
                break;
            case 62 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:583: KW_COLUMN
                {
                mKW_COLUMN(); 

                }
                break;
            case 63 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:593: KW_FIRST
                {
                mKW_FIRST(); 

                }
                break;
            case 64 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:602: KW_AFTER
                {
                mKW_AFTER(); 

                }
                break;
            case 65 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:611: KW_DESCRIBE
                {
                mKW_DESCRIBE(); 

                }
                break;
            case 66 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:623: KW_DROP
                {
                mKW_DROP(); 

                }
                break;
            case 67 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:631: KW_RENAME
                {
                mKW_RENAME(); 

                }
                break;
            case 68 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:641: KW_IGNORE
                {
                mKW_IGNORE(); 

                }
                break;
            case 69 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:651: KW_PROTECTION
                {
                mKW_PROTECTION(); 

                }
                break;
            case 70 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:665: KW_TO
                {
                mKW_TO(); 

                }
                break;
            case 71 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:671: KW_COMMENT
                {
                mKW_COMMENT(); 

                }
                break;
            case 72 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:682: KW_BOOLEAN
                {
                mKW_BOOLEAN(); 

                }
                break;
            case 73 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:693: KW_TINYINT
                {
                mKW_TINYINT(); 

                }
                break;
            case 74 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:704: KW_SMALLINT
                {
                mKW_SMALLINT(); 

                }
                break;
            case 75 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:716: KW_INT
                {
                mKW_INT(); 

                }
                break;
            case 76 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:723: KW_BIGINT
                {
                mKW_BIGINT(); 

                }
                break;
            case 77 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:733: KW_FLOAT
                {
                mKW_FLOAT(); 

                }
                break;
            case 78 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:742: KW_DOUBLE
                {
                mKW_DOUBLE(); 

                }
                break;
            case 79 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:752: KW_DATE
                {
                mKW_DATE(); 

                }
                break;
            case 80 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:760: KW_DATETIME
                {
                mKW_DATETIME(); 

                }
                break;
            case 81 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:772: KW_TIMESTAMP
                {
                mKW_TIMESTAMP(); 

                }
                break;
            case 82 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:785: KW_STRING
                {
                mKW_STRING(); 

                }
                break;
            case 83 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:795: KW_ARRAY
                {
                mKW_ARRAY(); 

                }
                break;
            case 84 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:804: KW_STRUCT
                {
                mKW_STRUCT(); 

                }
                break;
            case 85 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:814: KW_MAP
                {
                mKW_MAP(); 

                }
                break;
            case 86 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:821: KW_UNIONTYPE
                {
                mKW_UNIONTYPE(); 

                }
                break;
            case 87 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:834: KW_REDUCE
                {
                mKW_REDUCE(); 

                }
                break;
            case 88 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:844: KW_PARTITIONED
                {
                mKW_PARTITIONED(); 

                }
                break;
            case 89 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:859: KW_CLUSTERED
                {
                mKW_CLUSTERED(); 

                }
                break;
            case 90 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:872: KW_SORTED
                {
                mKW_SORTED(); 

                }
                break;
            case 91 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:882: KW_INTO
                {
                mKW_INTO(); 

                }
                break;
            case 92 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:890: KW_BUCKETS
                {
                mKW_BUCKETS(); 

                }
                break;
            case 93 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:901: KW_ROW
                {
                mKW_ROW(); 

                }
                break;
            case 94 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:908: KW_ROWS
                {
                mKW_ROWS(); 

                }
                break;
            case 95 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:916: KW_FORMAT
                {
                mKW_FORMAT(); 

                }
                break;
            case 96 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:926: KW_DELIMITED
                {
                mKW_DELIMITED(); 

                }
                break;
            case 97 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:939: KW_FIELDS
                {
                mKW_FIELDS(); 

                }
                break;
            case 98 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:949: KW_TERMINATED
                {
                mKW_TERMINATED(); 

                }
                break;
            case 99 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:963: KW_ESCAPED
                {
                mKW_ESCAPED(); 

                }
                break;
            case 100 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:974: KW_COLLECTION
                {
                mKW_COLLECTION(); 

                }
                break;
            case 101 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:988: KW_ITEMS
                {
                mKW_ITEMS(); 

                }
                break;
            case 102 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:997: KW_KEYS
                {
                mKW_KEYS(); 

                }
                break;
            case 103 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1005: KW_KEY_TYPE
                {
                mKW_KEY_TYPE(); 

                }
                break;
            case 104 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1017: KW_LINES
                {
                mKW_LINES(); 

                }
                break;
            case 105 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1026: KW_STORED
                {
                mKW_STORED(); 

                }
                break;
            case 106 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1036: KW_FILEFORMAT
                {
                mKW_FILEFORMAT(); 

                }
                break;
            case 107 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1050: KW_SEQUENCEFILE
                {
                mKW_SEQUENCEFILE(); 

                }
                break;
            case 108 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1066: KW_TEXTFILE
                {
                mKW_TEXTFILE(); 

                }
                break;
            case 109 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1078: KW_RCFILE
                {
                mKW_RCFILE(); 

                }
                break;
            case 110 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1088: KW_INPUTFORMAT
                {
                mKW_INPUTFORMAT(); 

                }
                break;
            case 111 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1103: KW_OUTPUTFORMAT
                {
                mKW_OUTPUTFORMAT(); 

                }
                break;
            case 112 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1119: KW_INPUTDRIVER
                {
                mKW_INPUTDRIVER(); 

                }
                break;
            case 113 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1134: KW_OUTPUTDRIVER
                {
                mKW_OUTPUTDRIVER(); 

                }
                break;
            case 114 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1150: KW_OFFLINE
                {
                mKW_OFFLINE(); 

                }
                break;
            case 115 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1161: KW_ENABLE
                {
                mKW_ENABLE(); 

                }
                break;
            case 116 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1171: KW_DISABLE
                {
                mKW_DISABLE(); 

                }
                break;
            case 117 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1182: KW_READONLY
                {
                mKW_READONLY(); 

                }
                break;
            case 118 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1194: KW_NO_DROP
                {
                mKW_NO_DROP(); 

                }
                break;
            case 119 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1205: KW_LOCATION
                {
                mKW_LOCATION(); 

                }
                break;
            case 120 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1217: KW_TABLESAMPLE
                {
                mKW_TABLESAMPLE(); 

                }
                break;
            case 121 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1232: KW_BUCKET
                {
                mKW_BUCKET(); 

                }
                break;
            case 122 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1242: KW_OUT
                {
                mKW_OUT(); 

                }
                break;
            case 123 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1249: KW_OF
                {
                mKW_OF(); 

                }
                break;
            case 124 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1255: KW_PERCENT
                {
                mKW_PERCENT(); 

                }
                break;
            case 125 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1266: KW_CAST
                {
                mKW_CAST(); 

                }
                break;
            case 126 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1274: KW_ADD
                {
                mKW_ADD(); 

                }
                break;
            case 127 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1281: KW_REPLACE
                {
                mKW_REPLACE(); 

                }
                break;
            case 128 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1292: KW_RLIKE
                {
                mKW_RLIKE(); 

                }
                break;
            case 129 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1301: KW_REGEXP
                {
                mKW_REGEXP(); 

                }
                break;
            case 130 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1311: KW_TEMPORARY
                {
                mKW_TEMPORARY(); 

                }
                break;
            case 131 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1324: KW_FUNCTION
                {
                mKW_FUNCTION(); 

                }
                break;
            case 132 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1336: KW_EXPLAIN
                {
                mKW_EXPLAIN(); 

                }
                break;
            case 133 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1347: KW_EXTENDED
                {
                mKW_EXTENDED(); 

                }
                break;
            case 134 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1359: KW_FORMATTED
                {
                mKW_FORMATTED(); 

                }
                break;
            case 135 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1372: KW_DEPENDENCY
                {
                mKW_DEPENDENCY(); 

                }
                break;
            case 136 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1386: KW_SERDE
                {
                mKW_SERDE(); 

                }
                break;
            case 137 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1395: KW_WITH
                {
                mKW_WITH(); 

                }
                break;
            case 138 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1403: KW_DEFERRED
                {
                mKW_DEFERRED(); 

                }
                break;
            case 139 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1415: KW_SERDEPROPERTIES
                {
                mKW_SERDEPROPERTIES(); 

                }
                break;
            case 140 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1434: KW_DBPROPERTIES
                {
                mKW_DBPROPERTIES(); 

                }
                break;
            case 141 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1450: KW_LIMIT
                {
                mKW_LIMIT(); 

                }
                break;
            case 142 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1459: KW_SET
                {
                mKW_SET(); 

                }
                break;
            case 143 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1466: KW_UNSET
                {
                mKW_UNSET(); 

                }
                break;
            case 144 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1475: KW_TBLPROPERTIES
                {
                mKW_TBLPROPERTIES(); 

                }
                break;
            case 145 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1492: KW_IDXPROPERTIES
                {
                mKW_IDXPROPERTIES(); 

                }
                break;
            case 146 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1509: KW_VALUE_TYPE
                {
                mKW_VALUE_TYPE(); 

                }
                break;
            case 147 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1523: KW_ELEM_TYPE
                {
                mKW_ELEM_TYPE(); 

                }
                break;
            case 148 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1536: KW_CASE
                {
                mKW_CASE(); 

                }
                break;
            case 149 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1544: KW_WHEN
                {
                mKW_WHEN(); 

                }
                break;
            case 150 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1552: KW_THEN
                {
                mKW_THEN(); 

                }
                break;
            case 151 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1560: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 152 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1568: KW_END
                {
                mKW_END(); 

                }
                break;
            case 153 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1575: KW_MAPJOIN
                {
                mKW_MAPJOIN(); 

                }
                break;
            case 154 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1586: KW_STREAMTABLE
                {
                mKW_STREAMTABLE(); 

                }
                break;
            case 155 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1601: KW_HOLD_DDLTIME
                {
                mKW_HOLD_DDLTIME(); 

                }
                break;
            case 156 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1617: KW_CLUSTERSTATUS
                {
                mKW_CLUSTERSTATUS(); 

                }
                break;
            case 157 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1634: KW_UTC
                {
                mKW_UTC(); 

                }
                break;
            case 158 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1641: KW_UTCTIMESTAMP
                {
                mKW_UTCTIMESTAMP(); 

                }
                break;
            case 159 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1657: KW_LONG
                {
                mKW_LONG(); 

                }
                break;
            case 160 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1665: KW_DELETE
                {
                mKW_DELETE(); 

                }
                break;
            case 161 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1675: KW_PLUS
                {
                mKW_PLUS(); 

                }
                break;
            case 162 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1683: KW_MINUS
                {
                mKW_MINUS(); 

                }
                break;
            case 163 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1692: KW_FETCH
                {
                mKW_FETCH(); 

                }
                break;
            case 164 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1701: KW_INTERSECT
                {
                mKW_INTERSECT(); 

                }
                break;
            case 165 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1714: KW_VIEW
                {
                mKW_VIEW(); 

                }
                break;
            case 166 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1722: KW_IN
                {
                mKW_IN(); 

                }
                break;
            case 167 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1728: KW_DATABASE
                {
                mKW_DATABASE(); 

                }
                break;
            case 168 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1740: KW_DATABASES
                {
                mKW_DATABASES(); 

                }
                break;
            case 169 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1753: KW_MATERIALIZED
                {
                mKW_MATERIALIZED(); 

                }
                break;
            case 170 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1769: KW_SCHEMA
                {
                mKW_SCHEMA(); 

                }
                break;
            case 171 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1779: KW_SCHEMAS
                {
                mKW_SCHEMAS(); 

                }
                break;
            case 172 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1790: KW_GRANT
                {
                mKW_GRANT(); 

                }
                break;
            case 173 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1799: KW_REVOKE
                {
                mKW_REVOKE(); 

                }
                break;
            case 174 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1809: KW_SSL
                {
                mKW_SSL(); 

                }
                break;
            case 175 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1816: KW_UNDO
                {
                mKW_UNDO(); 

                }
                break;
            case 176 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1824: KW_LOCK
                {
                mKW_LOCK(); 

                }
                break;
            case 177 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1832: KW_LOCKS
                {
                mKW_LOCKS(); 

                }
                break;
            case 178 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1841: KW_UNLOCK
                {
                mKW_UNLOCK(); 

                }
                break;
            case 179 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1851: KW_SHARED
                {
                mKW_SHARED(); 

                }
                break;
            case 180 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1861: KW_EXCLUSIVE
                {
                mKW_EXCLUSIVE(); 

                }
                break;
            case 181 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1874: KW_PROCEDURE
                {
                mKW_PROCEDURE(); 

                }
                break;
            case 182 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1887: KW_UNSIGNED
                {
                mKW_UNSIGNED(); 

                }
                break;
            case 183 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1899: KW_WHILE
                {
                mKW_WHILE(); 

                }
                break;
            case 184 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1908: KW_READ
                {
                mKW_READ(); 

                }
                break;
            case 185 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1916: KW_READS
                {
                mKW_READS(); 

                }
                break;
            case 186 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1925: KW_PURGE
                {
                mKW_PURGE(); 

                }
                break;
            case 187 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1934: KW_RANGE
                {
                mKW_RANGE(); 

                }
                break;
            case 188 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1943: KW_ANALYZE
                {
                mKW_ANALYZE(); 

                }
                break;
            case 189 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1954: KW_BEFORE
                {
                mKW_BEFORE(); 

                }
                break;
            case 190 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1964: KW_BETWEEN
                {
                mKW_BETWEEN(); 

                }
                break;
            case 191 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1975: KW_BOTH
                {
                mKW_BOTH(); 

                }
                break;
            case 192 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1983: KW_BINARY
                {
                mKW_BINARY(); 

                }
                break;
            case 193 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1993: KW_CROSS
                {
                mKW_CROSS(); 

                }
                break;
            case 194 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2002: KW_CONTINUE
                {
                mKW_CONTINUE(); 

                }
                break;
            case 195 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2014: KW_CURSOR
                {
                mKW_CURSOR(); 

                }
                break;
            case 196 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2024: KW_TRIGGER
                {
                mKW_TRIGGER(); 

                }
                break;
            case 197 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2035: KW_RECORDREADER
                {
                mKW_RECORDREADER(); 

                }
                break;
            case 198 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2051: KW_RECORDWRITER
                {
                mKW_RECORDWRITER(); 

                }
                break;
            case 199 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2067: KW_SEMI
                {
                mKW_SEMI(); 

                }
                break;
            case 200 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2075: KW_LATERAL
                {
                mKW_LATERAL(); 

                }
                break;
            case 201 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2086: KW_TOUCH
                {
                mKW_TOUCH(); 

                }
                break;
            case 202 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2095: KW_ARCHIVE
                {
                mKW_ARCHIVE(); 

                }
                break;
            case 203 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2106: KW_UNARCHIVE
                {
                mKW_UNARCHIVE(); 

                }
                break;
            case 204 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2119: KW_COMPUTE
                {
                mKW_COMPUTE(); 

                }
                break;
            case 205 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2130: KW_STATISTICS
                {
                mKW_STATISTICS(); 

                }
                break;
            case 206 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2144: KW_USE
                {
                mKW_USE(); 

                }
                break;
            case 207 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2151: KW_OPTION
                {
                mKW_OPTION(); 

                }
                break;
            case 208 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2161: KW_CONCATENATE
                {
                mKW_CONCATENATE(); 

                }
                break;
            case 209 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2176: KW_SHOW_DATABASE
                {
                mKW_SHOW_DATABASE(); 

                }
                break;
            case 210 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2193: KW_UPDATE
                {
                mKW_UPDATE(); 

                }
                break;
            case 211 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2203: KW_RESTRICT
                {
                mKW_RESTRICT(); 

                }
                break;
            case 212 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2215: KW_CASCADE
                {
                mKW_CASCADE(); 

                }
                break;
            case 213 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2226: KW_SKEWED
                {
                mKW_SKEWED(); 

                }
                break;
            case 214 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2236: KW_ROLLUP
                {
                mKW_ROLLUP(); 

                }
                break;
            case 215 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2246: KW_CUBE
                {
                mKW_CUBE(); 

                }
                break;
            case 216 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2254: KW_DIRECTORIES
                {
                mKW_DIRECTORIES(); 

                }
                break;
            case 217 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2269: KW_FOR
                {
                mKW_FOR(); 

                }
                break;
            case 218 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2276: KW_GROUPING
                {
                mKW_GROUPING(); 

                }
                break;
            case 219 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2288: KW_SETS
                {
                mKW_SETS(); 

                }
                break;
            case 220 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2296: KW_TRUNCATE
                {
                mKW_TRUNCATE(); 

                }
                break;
            case 221 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2308: DOT
                {
                mDOT(); 

                }
                break;
            case 222 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2312: COLON
                {
                mCOLON(); 

                }
                break;
            case 223 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2318: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 224 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2324: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 225 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2334: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 226 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2341: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 227 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2348: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 228 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2356: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 229 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2364: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 230 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2371: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 231 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2378: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 232 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2384: EQUAL_NS
                {
                mEQUAL_NS(); 

                }
                break;
            case 233 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2393: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 234 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2402: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 

                }
                break;
            case 235 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2420: LESSTHAN
                {
                mLESSTHAN(); 

                }
                break;
            case 236 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2429: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 

                }
                break;
            case 237 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2450: GREATERTHAN
                {
                mGREATERTHAN(); 

                }
                break;
            case 238 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2462: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 239 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2469: PLUS
                {
                mPLUS(); 

                }
                break;
            case 240 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2474: MINUS
                {
                mMINUS(); 

                }
                break;
            case 241 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2480: STAR
                {
                mSTAR(); 

                }
                break;
            case 242 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2485: MOD
                {
                mMOD(); 

                }
                break;
            case 243 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2489: DIV
                {
                mDIV(); 

                }
                break;
            case 244 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2493: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 245 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2503: TILDE
                {
                mTILDE(); 

                }
                break;
            case 246 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2509: BITWISEOR
                {
                mBITWISEOR(); 

                }
                break;
            case 247 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2519: BITWISEXOR
                {
                mBITWISEXOR(); 

                }
                break;
            case 248 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2530: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 249 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2539: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 250 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2546: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 251 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2560: CharSetLiteral
                {
                mCharSetLiteral(); 

                }
                break;
            case 252 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2575: BigintLiteral
                {
                mBigintLiteral(); 

                }
                break;
            case 253 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2589: SmallintLiteral
                {
                mSmallintLiteral(); 

                }
                break;
            case 254 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2605: TinyintLiteral
                {
                mTinyintLiteral(); 

                }
                break;
            case 255 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2620: ByteLengthLiteral
                {
                mByteLengthLiteral(); 

                }
                break;
            case 256 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2638: Number
                {
                mNumber(); 

                }
                break;
            case 257 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2645: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 258 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2656: CharSetName
                {
                mCharSetName(); 

                }
                break;
            case 259 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2668: WS
                {
                mWS(); 

                }
                break;
            case 260 :
                // /home/foo/comitter/hive-trunk/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:2671: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\uffff\5\64\1\124\20\64\1\u0099\1\64\13\uffff\1\u009c\1\u009e"+
        "\2\uffff\1\u00a0\11\uffff\2\u00a8\3\uffff\4\64\1\u00b6\12\64\1\u00c8"+
        "\5\64\1\u00d2\1\u00d4\1\64\1\u00d6\3\64\2\uffff\4\64\1\u00e7\2\64"+
        "\1\u00ea\1\u00eb\16\64\1\u0104\51\64\4\uffff\1\64\1\u014f\7\uffff"+
        "\1\u0151\2\uffff\1\u0151\1\64\1\uffff\1\u0154\1\u00a8\1\u0155\1"+
        "\u0156\1\u0157\10\64\1\uffff\5\64\1\u0167\11\64\1\u0171\1\u0172"+
        "\1\uffff\2\64\1\u0175\2\64\1\u0178\1\64\1\u017c\1\64\1\uffff\1\64"+
        "\1\uffff\1\64\1\uffff\1\64\1\124\14\64\1\u0191\1\64\1\uffff\2\64"+
        "\2\uffff\3\64\1\u0198\10\64\1\u01a3\13\64\1\uffff\14\64\1\u01bf"+
        "\12\64\1\u01cc\7\64\1\u01d7\2\64\1\u01da\22\64\1\u01f0\16\64\1\u0205"+
        "\4\64\5\uffff\1\u020a\4\uffff\1\u00a8\4\64\1\u020f\3\64\1\u0213"+
        "\5\64\1\uffff\5\64\1\u021e\1\64\1\u0220\1\64\2\uffff\2\64\1\uffff"+
        "\2\64\1\uffff\3\64\1\uffff\5\64\1\u022e\1\u022f\1\u0231\1\64\1\u0234"+
        "\1\u0235\3\64\1\u0239\3\64\1\u023d\1\64\1\uffff\6\64\1\uffff\1\64"+
        "\1\u0246\10\64\1\uffff\2\64\1\u0254\2\64\1\u0258\1\u025a\2\64\1"+
        "\u025d\3\64\1\u0261\7\64\1\u0269\2\64\1\u026c\1\64\1\u026e\1\uffff"+
        "\1\64\1\u0270\1\64\1\u0273\7\64\1\u027c\1\uffff\10\64\1\u0285\1"+
        "\64\1\uffff\2\64\1\uffff\2\64\1\u028b\4\64\1\u0290\1\64\1\u0294"+
        "\12\64\1\u029f\1\uffff\3\64\1\u02a3\1\64\1\u02a5\7\64\1\u02ad\6"+
        "\64\1\uffff\1\64\1\u02b5\1\u02b6\1\u02b7\1\uffff\3\64\1\u02bc\1"+
        "\uffff\1\64\1\u02be\1\64\1\uffff\5\64\1\u02c5\2\64\1\u02c8\1\64"+
        "\1\uffff\1\u02ca\1\uffff\1\u02cb\1\u02cc\1\64\1\u02ce\1\64\1\u02d0"+
        "\1\64\1\u02d2\1\64\1\u02d4\3\64\2\uffff\1\u02d8\1\uffff\1\64\1\u02da"+
        "\2\uffff\1\u02db\1\u02dc\1\64\1\uffff\3\64\1\uffff\1\64\1\u02e4"+
        "\1\u02e5\5\64\1\uffff\15\64\1\uffff\3\64\1\uffff\1\64\1\uffff\2"+
        "\64\1\uffff\1\u02ff\1\u0300\1\64\1\uffff\7\64\1\uffff\1\u0309\1"+
        "\u030a\1\uffff\1\u030c\1\uffff\1\64\1\uffff\2\64\1\uffff\10\64\1"+
        "\uffff\4\64\1\u031d\1\64\1\u031f\1\64\1\uffff\2\64\1\u0323\2\64"+
        "\1\uffff\3\64\1\u0329\1\uffff\2\64\1\u032c\1\uffff\12\64\1\uffff"+
        "\1\u0337\1\u0338\1\u0339\1\uffff\1\64\1\uffff\7\64\1\uffff\2\64"+
        "\1\u0344\3\64\1\u0348\3\uffff\3\64\1\u034d\1\uffff\1\64\1\uffff"+
        "\5\64\1\u0355\1\uffff\1\u0356\1\64\1\uffff\1\64\3\uffff\1\64\1\uffff"+
        "\1\64\1\uffff\1\64\1\uffff\1\64\1\uffff\1\u035e\2\64\1\uffff\1\64"+
        "\3\uffff\1\64\1\u0363\2\64\1\u0366\2\64\2\uffff\1\64\1\u036a\1\u036b"+
        "\1\u036c\4\64\1\u0371\1\64\1\u0373\4\64\1\u0378\7\64\1\u0380\1\64"+
        "\2\uffff\1\u0383\1\64\1\u0385\1\u0386\1\64\1\u0388\1\64\1\u038a"+
        "\2\uffff\1\64\1\uffff\1\u038c\1\64\1\u038e\1\u038f\1\64\1\u0391"+
        "\1\u0392\1\64\1\u0394\1\u0395\1\64\1\u0398\4\64\1\uffff\1\64\1\uffff"+
        "\1\u039e\1\64\1\u03a0\1\uffff\5\64\1\uffff\1\u03a6\1\64\1\uffff"+
        "\1\u03a8\1\64\1\u03aa\2\64\1\u03ae\1\u03af\1\u03b0\1\64\1\u03b2"+
        "\3\uffff\6\64\1\u03ba\1\64\1\u03bc\1\u03bd\1\uffff\1\u03be\2\64"+
        "\1\uffff\4\64\1\uffff\2\64\1\u03c7\1\64\1\u03c9\2\64\2\uffff\2\64"+
        "\1\u03ce\1\u03cf\2\64\1\u03d2\1\uffff\1\64\1\u03d4\1\64\1\u03d6"+
        "\1\uffff\2\64\1\uffff\1\64\1\u03da\1\64\3\uffff\1\u03dc\3\64\1\uffff"+
        "\1\u03e0\1\uffff\3\64\1\u03e4\1\uffff\7\64\1\uffff\1\64\1\u03ed"+
        "\1\uffff\1\u03ee\2\uffff\1\u03ef\1\uffff\1\64\1\uffff\1\64\1\uffff"+
        "\1\64\2\uffff\1\64\2\uffff\1\64\2\uffff\1\64\1\u03f6\1\uffff\5\64"+
        "\1\uffff\1\64\1\uffff\1\u03fd\4\64\1\uffff\1\64\1\uffff\1\u0403"+
        "\1\uffff\3\64\3\uffff\1\u0407\1\uffff\1\u0408\1\u040b\2\64\1\u040e"+
        "\1\u040f\1\u0410\1\uffff\1\64\3\uffff\1\64\1\u0413\1\64\1\u0415"+
        "\3\64\1\u0419\1\uffff\1\64\1\uffff\3\64\1\u041f\2\uffff\2\64\1\uffff"+
        "\1\64\1\uffff\1\u0423\1\uffff\3\64\1\uffff\1\64\1\uffff\1\64\1\u0429"+
        "\1\u042a\1\uffff\1\64\1\u042d\1\64\1\uffff\1\64\1\u0430\1\u0431"+
        "\1\64\1\u0434\1\u0435\1\64\1\u0437\3\uffff\6\64\1\uffff\1\u043e"+
        "\3\64\1\u0442\1\64\1\uffff\3\64\1\u0447\1\u0448\1\uffff\2\64\1\u044b"+
        "\2\uffff\2\64\1\uffff\1\64\1\u044f\3\uffff\2\64\1\uffff\1\u0452"+
        "\1\uffff\3\64\1\uffff\1\u0456\1\u0457\1\u0458\1\64\1\u045a\1\uffff"+
        "\2\64\1\u045d\1\uffff\2\64\1\u0460\1\64\1\u0462\2\uffff\1\u0463"+
        "\1\64\1\uffff\1\64\1\u0466\2\uffff\1\64\1\u0468\2\uffff\1\64\1\uffff"+
        "\6\64\1\uffff\1\u0470\1\64\1\u0472\1\uffff\1\64\1\u0476\1\u0477"+
        "\1\64\2\uffff\2\64\1\uffff\1\64\1\u047c\1\64\1\uffff\2\64\1\uffff"+
        "\1\u0480\2\64\3\uffff\1\u0483\1\uffff\2\64\1\uffff\2\64\1\uffff"+
        "\1\64\2\uffff\1\64\1\u048a\1\uffff\1\u048b\1\uffff\5\64\1\u0491"+
        "\1\64\1\uffff\1\u0493\1\uffff\1\64\1\u0495\1\64\2\uffff\1\u0497"+
        "\3\64\1\uffff\1\64\1\u049c\1\64\1\uffff\1\u049e\1\64\1\uffff\2\64"+
        "\1\u04a2\1\u04a3\1\64\1\u04a5\2\uffff\4\64\1\u04aa\1\uffff\1\64"+
        "\1\uffff\1\64\1\uffff\1\u04ad\1\uffff\3\64\1\u04b1\1\uffff\1\64"+
        "\1\uffff\1\64\1\u04b4\1\u04b5\2\uffff\1\64\1\uffff\1\u04b7\1\u04b8"+
        "\1\64\1\u04ba\1\uffff\1\64\1\u04bc\1\uffff\1\u04bd\1\u04be\1\64"+
        "\1\uffff\1\u04c0\1\u04c1\2\uffff\1\u04c2\2\uffff\1\64\1\uffff\1"+
        "\u04c4\3\uffff\1\u04c5\3\uffff\1\64\2\uffff\1\u04c7\1\uffff";
    static final String DFA24_eofS =
        "\u04c8\uffff";
    static final String DFA24_minS =
        "\1\11\2\101\1\104\1\106\1\117\1\75\1\101\1\104\1\114\1\101\1\122"+
        "\1\105\1\101\1\110\1\103\1\116\1\101\1\117\3\101\2\105\1\111\13"+
        "\uffff\2\75\2\uffff\1\55\7\uffff\2\0\2\60\3\uffff\1\115\1\102\1"+
        "\105\1\114\1\60\1\101\1\115\1\122\1\105\1\124\2\114\2\117\1\104"+
        "\1\60\1\103\1\114\1\101\2\124\2\60\1\124\1\60\1\105\1\124\1\114"+
        "\2\uffff\1\101\1\113\1\124\1\106\1\60\1\105\1\130\2\60\1\120\1\116"+
        "\1\101\1\103\1\123\1\103\1\122\1\106\1\124\1\120\1\125\1\117\1\101"+
        "\1\103\1\60\1\117\1\107\1\106\1\114\1\126\1\105\1\124\1\114\1\122"+
        "\1\101\1\105\1\101\1\114\1\110\2\101\1\103\1\104\1\105\2\122\1\125"+
        "\1\105\1\122\1\111\1\106\1\101\1\114\1\111\1\107\1\116\1\123\1\125"+
        "\1\114\1\102\1\105\1\101\1\120\1\116\1\103\1\131\4\uffff\1\105\1"+
        "\76\5\uffff\2\0\1\42\2\0\1\42\1\60\1\uffff\5\60\1\53\1\120\1\124"+
        "\1\115\1\114\1\116\1\120\1\103\1\uffff\1\105\1\107\1\116\1\131\1"+
        "\105\1\60\1\123\1\114\1\105\2\103\1\114\1\123\1\115\1\101\2\60\1"+
        "\uffff\1\101\1\110\1\60\1\105\1\114\1\60\1\105\1\60\1\114\1\uffff"+
        "\1\105\1\uffff\1\111\1\uffff\1\122\1\60\1\104\1\114\1\104\1\101"+
        "\1\107\2\105\1\111\1\105\1\124\1\101\1\105\1\60\1\105\1\uffff\1"+
        "\115\1\120\2\uffff\2\117\1\102\1\60\1\101\1\105\1\114\1\105\1\114"+
        "\1\123\1\105\1\101\1\60\1\105\1\103\2\105\1\101\1\122\1\102\1\120"+
        "\1\125\1\116\1\113\1\uffff\1\110\1\114\1\101\1\111\1\127\1\117\1"+
        "\104\1\111\1\116\1\114\1\110\1\104\1\60\1\105\1\111\1\125\1\124"+
        "\1\105\1\122\1\124\1\127\1\122\1\127\1\60\1\105\1\114\1\122\1\117"+
        "\1\105\2\117\1\60\1\101\1\116\1\60\1\103\1\124\1\123\1\103\1\123"+
        "\1\107\1\116\1\111\1\104\1\117\1\101\1\117\1\124\1\101\1\105\2\125"+
        "\1\114\1\60\1\113\1\110\1\107\1\103\1\123\1\103\1\115\1\114\1\105"+
        "\1\123\1\101\1\123\1\116\1\105\1\60\1\125\1\113\1\123\1\127\2\uffff"+
        "\1\0\1\uffff\1\0\1\60\4\uffff\1\60\1\117\1\106\1\111\1\105\1\60"+
        "\1\122\1\110\1\103\1\60\1\107\1\123\1\111\1\123\1\101\1\uffff\1"+
        "\124\1\104\1\106\1\110\1\124\1\60\1\105\1\60\1\124\2\uffff\1\131"+
        "\1\111\1\uffff\1\122\1\131\1\uffff\1\122\1\125\1\122\1\uffff\1\111"+
        "\1\122\1\117\1\127\1\122\3\60\1\114\2\60\1\123\1\124\1\122\1\60"+
        "\2\124\1\122\1\60\1\122\1\uffff\1\130\1\123\3\122\1\114\1\uffff"+
        "\1\120\1\60\1\125\1\116\1\122\1\101\1\124\1\103\1\111\1\102\1\uffff"+
        "\1\124\1\115\1\60\1\122\1\116\2\60\1\117\1\114\1\60\1\120\1\124"+
        "\1\105\1\60\1\105\1\122\1\116\1\105\1\122\1\137\1\116\1\60\2\105"+
        "\1\60\1\105\1\60\1\uffff\1\103\1\60\1\105\1\60\1\116\1\101\1\103"+
        "\1\105\1\111\2\105\1\60\1\uffff\1\115\1\114\1\103\1\125\1\116\1"+
        "\107\1\124\1\103\1\60\1\124\1\uffff\1\124\1\107\1\uffff\1\105\1"+
        "\111\1\60\4\105\1\60\1\114\1\60\1\113\1\101\1\111\2\122\1\115\1"+
        "\130\1\103\1\111\1\125\1\60\1\uffff\1\105\1\124\1\105\1\60\1\101"+
        "\1\60\1\124\1\101\1\111\1\105\1\125\1\115\1\105\1\60\1\117\1\124"+
        "\1\123\1\107\1\122\1\117\1\uffff\1\123\3\60\1\uffff\1\122\1\111"+
        "\1\116\1\60\1\uffff\1\117\1\60\1\101\1\uffff\1\105\1\106\1\116\2"+
        "\124\1\60\1\123\1\117\1\60\1\111\1\uffff\1\60\1\uffff\2\60\1\126"+
        "\1\60\1\132\1\60\1\124\1\60\1\116\1\60\1\116\1\122\1\117\2\uffff"+
        "\1\60\1\uffff\1\111\1\60\2\uffff\2\60\1\101\1\uffff\1\110\1\104"+
        "\1\124\1\uffff\1\123\2\60\1\117\1\124\3\105\1\uffff\1\123\1\116"+
        "\1\104\1\124\1\111\1\123\1\124\1\116\1\111\1\114\1\105\2\111\1\uffff"+
        "\1\122\1\104\1\101\1\uffff\1\111\1\uffff\1\120\1\105\1\uffff\2\60"+
        "\1\124\1\uffff\1\101\1\131\1\124\2\105\1\104\1\107\1\uffff\2\60"+
        "\1\uffff\1\60\1\uffff\1\124\1\uffff\1\116\1\104\1\uffff\1\107\1"+
        "\115\1\124\1\104\1\123\3\104\1\uffff\1\101\1\111\1\110\1\105\1\60"+
        "\1\116\1\60\1\113\1\uffff\1\115\1\105\1\60\1\116\1\124\1\uffff\1"+
        "\104\1\103\1\122\1\60\1\uffff\1\105\1\116\1\60\1\uffff\1\105\1\103"+
        "\1\122\1\104\1\111\1\105\1\120\1\105\1\114\1\120\1\uffff\3\60\1"+
        "\uffff\1\104\1\uffff\1\105\1\124\2\116\1\124\1\116\1\103\1\uffff"+
        "\1\122\1\105\1\60\1\105\2\111\1\60\3\uffff\1\101\1\114\1\101\1\60"+
        "\1\uffff\1\120\1\uffff\1\124\1\122\1\117\1\124\1\101\1\60\1\uffff"+
        "\1\60\1\122\1\uffff\1\117\3\uffff\1\105\1\uffff\1\105\1\uffff\1"+
        "\104\1\uffff\1\105\1\uffff\1\60\1\111\1\120\1\uffff\1\117\3\uffff"+
        "\1\114\1\60\1\122\1\117\1\60\1\105\1\123\2\uffff\1\120\3\60\1\104"+
        "\1\111\1\101\1\105\1\60\1\116\1\60\1\117\1\103\1\102\1\105\1\60"+
        "\1\124\1\102\2\105\1\123\1\115\1\105\1\60\1\116\2\uffff\1\60\1\116"+
        "\2\60\1\116\1\60\1\104\1\60\2\uffff\1\122\1\uffff\1\60\1\103\2\60"+
        "\1\124\2\60\1\124\2\60\1\101\1\60\1\116\1\111\1\112\1\131\1\uffff"+
        "\1\105\1\uffff\1\60\1\105\1\60\1\uffff\1\124\1\111\1\125\1\124\1"+
        "\126\1\uffff\1\60\1\114\1\uffff\1\60\1\105\1\60\1\122\1\103\3\60"+
        "\1\104\1\60\3\uffff\1\105\1\122\1\105\1\125\1\124\1\105\1\60\1\124"+
        "\2\60\1\uffff\1\60\1\101\1\116\1\uffff\1\122\1\105\1\124\1\115\1"+
        "\uffff\2\105\1\60\1\122\1\60\1\115\1\105\2\uffff\1\115\1\116\2\60"+
        "\1\122\1\117\1\60\1\uffff\1\124\1\60\1\116\1\60\1\uffff\1\111\1"+
        "\122\1\uffff\1\103\1\60\1\105\3\uffff\1\60\1\126\1\114\1\104\1\uffff"+
        "\1\60\1\uffff\1\122\1\124\1\125\1\60\1\uffff\2\105\1\104\1\116\2"+
        "\105\1\122\1\uffff\1\107\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff"+
        "\1\114\1\uffff\1\117\1\uffff\1\105\2\uffff\1\101\2\uffff\1\111\2"+
        "\uffff\1\124\1\60\1\uffff\1\124\1\126\1\117\1\120\1\104\1\uffff"+
        "\1\123\1\uffff\1\60\1\117\1\122\1\111\1\105\1\uffff\1\131\1\uffff"+
        "\1\60\1\uffff\1\105\1\122\1\124\3\uffff\1\60\1\uffff\2\60\1\116"+
        "\1\105\3\60\1\uffff\1\111\3\uffff\1\114\1\60\1\131\1\60\1\105\1"+
        "\120\1\122\1\60\1\uffff\1\115\1\uffff\1\120\1\104\1\101\1\60\2\uffff"+
        "\1\111\1\122\1\uffff\1\105\1\uffff\1\60\1\uffff\1\126\1\115\1\124"+
        "\1\uffff\1\122\1\uffff\1\105\2\60\1\uffff\1\111\1\60\1\124\1\uffff"+
        "\1\104\2\60\1\103\2\60\1\124\1\60\3\uffff\1\124\1\120\1\106\1\102"+
        "\1\103\1\101\1\uffff\1\60\1\105\1\111\1\105\1\60\1\124\1\uffff\1"+
        "\116\1\105\1\117\2\60\1\uffff\1\101\1\111\1\60\2\uffff\1\124\1\104"+
        "\1\uffff\1\101\1\60\3\uffff\1\117\1\111\1\uffff\1\60\1\uffff\1\104"+
        "\1\114\1\124\1\uffff\3\60\1\124\1\60\1\uffff\1\126\1\115\1\60\1"+
        "\uffff\1\105\1\101\1\60\1\124\1\60\2\uffff\1\60\1\105\1\uffff\1"+
        "\105\1\60\2\uffff\1\131\1\60\2\uffff\1\111\1\uffff\1\111\1\105\1"+
        "\111\1\114\1\123\1\102\1\uffff\1\60\1\116\1\60\1\uffff\1\101\2\60"+
        "\1\116\2\uffff\1\104\1\124\1\uffff\1\101\1\60\1\124\1\uffff\1\116"+
        "\1\132\1\uffff\1\60\1\105\1\111\3\uffff\1\60\1\uffff\1\105\1\101"+
        "\1\uffff\1\122\1\124\1\uffff\1\111\2\uffff\1\123\1\60\1\uffff\1"+
        "\60\1\uffff\1\105\1\115\1\122\1\114\1\105\1\60\1\101\1\uffff\1\60"+
        "\1\uffff\1\115\1\60\1\104\2\uffff\1\60\2\105\1\124\1\uffff\1\105"+
        "\1\60\1\105\1\uffff\1\60\1\105\1\uffff\1\122\1\124\2\60\1\105\1"+
        "\60\2\uffff\1\123\1\105\1\124\1\105\1\60\1\uffff\1\123\1\uffff\1"+
        "\120\1\uffff\1\60\1\uffff\2\122\1\125\1\60\1\uffff\1\104\1\uffff"+
        "\1\123\2\60\2\uffff\1\123\1\uffff\2\60\1\111\1\60\1\uffff\1\105"+
        "\1\60\1\uffff\2\60\1\123\1\uffff\2\60\2\uffff\1\60\2\uffff\1\105"+
        "\1\uffff\1\60\3\uffff\1\60\3\uffff\1\123\2\uffff\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\176\1\122\1\125\1\123\1\126\1\125\1\75\1\117\1\124\1\130\2\122"+
        "\1\131\1\117\1\111\2\124\1\125\2\117\1\125\1\123\1\105\1\126\1\111"+
        "\13\uffff\1\76\1\75\2\uffff\1\55\7\uffff\2\ufffe\2\172\3\uffff\1"+
        "\130\1\102\1\105\1\114\1\172\1\125\1\116\2\122\1\124\1\116\1\114"+
        "\2\117\1\104\1\172\1\122\1\124\1\104\2\124\2\172\1\124\1\172\1\105"+
        "\1\137\1\114\2\uffff\2\116\1\124\1\106\1\172\1\105\1\130\2\172\1"+
        "\120\1\116\1\104\1\103\1\123\1\124\1\126\1\123\1\124\1\120\1\125"+
        "\2\117\1\103\1\172\1\124\1\116\1\124\1\114\1\126\1\111\2\124\2\122"+
        "\1\105\1\117\1\114\1\110\1\101\1\123\1\103\1\104\1\111\2\122\1\125"+
        "\1\117\1\122\1\111\1\106\1\126\1\127\1\111\1\107\1\116\1\123\1\125"+
        "\1\116\1\122\1\117\1\101\1\124\1\116\1\103\1\131\4\uffff\1\105\1"+
        "\76\5\uffff\2\ufffe\1\47\2\ufffe\1\47\1\146\1\uffff\5\172\1\71\1"+
        "\120\1\124\1\115\1\114\1\116\1\120\1\103\1\uffff\1\116\1\107\1\116"+
        "\1\131\1\105\1\172\1\123\1\114\1\105\2\103\1\114\1\123\1\115\1\101"+
        "\2\172\1\uffff\1\101\1\110\1\172\1\105\1\114\1\172\1\105\1\172\1"+
        "\114\1\uffff\1\105\1\uffff\1\111\1\uffff\1\122\1\172\1\104\1\114"+
        "\1\104\1\113\1\107\2\105\1\111\1\105\1\124\1\125\1\105\1\172\1\105"+
        "\1\uffff\1\115\1\120\2\uffff\2\117\1\102\1\172\1\101\1\105\1\114"+
        "\1\105\1\117\1\123\1\105\1\124\1\172\1\111\1\103\3\105\1\122\1\102"+
        "\1\120\1\125\1\116\1\113\1\uffff\1\110\1\114\1\101\1\111\1\127\1"+
        "\117\1\104\1\111\1\122\1\114\1\110\1\104\1\172\1\105\1\111\1\125"+
        "\1\124\1\125\1\122\1\124\1\127\1\122\1\127\1\172\1\105\1\114\1\122"+
        "\1\121\1\111\2\117\1\172\1\101\1\116\1\172\1\103\1\124\1\123\1\124"+
        "\1\123\1\107\1\116\1\111\1\104\1\117\1\114\1\117\1\124\1\101\1\105"+
        "\2\125\1\114\1\172\1\113\1\110\1\107\1\124\1\123\1\124\1\120\1\125"+
        "\1\105\1\123\1\101\1\123\1\116\1\105\1\172\1\125\1\113\1\123\1\127"+
        "\2\uffff\1\ufffe\1\uffff\1\ufffe\1\172\4\uffff\1\172\1\117\1\106"+
        "\1\111\1\105\1\172\1\122\1\110\1\103\1\172\1\107\1\123\1\111\1\123"+
        "\1\101\1\uffff\1\124\1\104\1\106\1\110\1\124\1\172\1\105\1\172\1"+
        "\124\2\uffff\1\131\1\111\1\uffff\1\122\1\131\1\uffff\1\122\1\125"+
        "\1\122\1\uffff\1\111\1\122\1\117\1\127\1\122\3\172\1\124\2\172\1"+
        "\123\1\124\1\122\1\172\2\124\1\122\1\172\1\122\1\uffff\1\130\1\123"+
        "\3\122\1\114\1\uffff\1\120\1\172\1\125\2\122\1\101\1\124\1\103\1"+
        "\122\1\102\1\uffff\1\124\1\115\1\172\1\122\1\116\2\172\1\117\1\114"+
        "\1\172\1\120\1\124\1\105\1\172\1\105\1\122\1\116\1\105\1\122\1\137"+
        "\1\116\1\172\2\105\1\172\1\105\1\172\1\uffff\1\103\1\172\1\105\1"+
        "\172\1\116\1\101\1\103\1\105\1\111\2\105\1\172\1\uffff\1\115\1\114"+
        "\1\103\1\125\1\116\1\107\1\124\1\103\1\172\1\124\1\uffff\1\124\1"+
        "\107\1\uffff\1\105\1\111\1\172\4\105\1\172\1\114\1\172\1\113\1\101"+
        "\1\111\2\122\1\115\1\130\1\103\1\111\1\125\1\172\1\uffff\1\105\1"+
        "\124\1\105\1\172\1\101\1\172\1\124\1\101\1\111\1\105\1\125\1\115"+
        "\1\105\1\172\1\117\1\124\1\123\1\107\1\122\1\117\1\uffff\1\123\3"+
        "\172\1\uffff\1\122\1\111\1\116\1\172\1\uffff\1\117\1\172\1\101\1"+
        "\uffff\1\105\1\106\1\116\2\124\1\172\1\123\1\117\1\172\1\111\1\uffff"+
        "\1\172\1\uffff\2\172\1\126\1\172\1\132\1\172\1\124\1\172\1\116\1"+
        "\172\1\116\1\122\1\117\2\uffff\1\172\1\uffff\1\111\1\172\2\uffff"+
        "\2\172\1\101\1\uffff\1\110\1\106\1\124\1\uffff\1\123\2\172\1\117"+
        "\1\124\3\105\1\uffff\1\123\1\116\1\104\1\124\1\111\1\123\1\124\1"+
        "\116\1\111\1\114\1\105\2\111\1\uffff\1\122\1\104\1\101\1\uffff\1"+
        "\111\1\uffff\1\120\1\105\1\uffff\2\172\1\124\1\uffff\1\101\1\131"+
        "\1\124\2\105\1\104\1\107\1\uffff\2\172\1\uffff\1\172\1\uffff\1\124"+
        "\1\uffff\1\116\1\104\1\uffff\1\107\1\115\1\124\1\104\1\123\3\104"+
        "\1\uffff\1\101\1\111\1\110\1\105\1\172\1\116\1\172\1\113\1\uffff"+
        "\1\115\1\105\1\172\1\116\1\124\1\uffff\1\104\1\103\1\122\1\172\1"+
        "\uffff\1\105\1\116\1\172\1\uffff\1\105\1\103\1\122\1\104\1\111\1"+
        "\105\1\120\1\105\1\114\1\120\1\uffff\3\172\1\uffff\1\104\1\uffff"+
        "\1\105\1\124\2\116\1\124\1\116\1\103\1\uffff\1\122\1\105\1\172\1"+
        "\105\2\111\1\172\3\uffff\1\101\1\114\1\101\1\172\1\uffff\1\120\1"+
        "\uffff\1\124\1\122\1\117\1\124\1\101\1\172\1\uffff\1\172\1\122\1"+
        "\uffff\1\117\3\uffff\1\105\1\uffff\1\105\1\uffff\1\106\1\uffff\1"+
        "\105\1\uffff\1\172\1\111\1\120\1\uffff\1\117\3\uffff\1\114\1\172"+
        "\1\122\1\117\1\172\1\105\1\123\2\uffff\1\120\3\172\1\104\1\111\1"+
        "\101\1\105\1\172\1\116\1\172\1\117\1\103\1\102\1\105\1\172\1\124"+
        "\1\102\2\105\1\123\1\115\1\105\1\172\1\116\2\uffff\1\172\1\116\2"+
        "\172\1\116\1\172\1\104\1\172\2\uffff\1\122\1\uffff\1\172\1\103\2"+
        "\172\1\124\2\172\1\124\2\172\1\101\1\172\1\116\1\111\1\112\1\131"+
        "\1\uffff\1\105\1\uffff\1\172\1\105\1\172\1\uffff\1\124\1\111\1\125"+
        "\1\124\1\126\1\uffff\1\172\1\114\1\uffff\1\172\1\105\1\172\1\127"+
        "\1\103\3\172\1\104\1\172\3\uffff\1\105\1\122\1\105\1\125\1\124\1"+
        "\105\1\172\1\124\2\172\1\uffff\1\172\1\101\1\116\1\uffff\1\122\1"+
        "\105\1\124\1\115\1\uffff\2\105\1\172\1\122\1\172\1\115\1\105\2\uffff"+
        "\1\115\1\116\2\172\1\122\1\117\1\172\1\uffff\1\124\1\172\1\116\1"+
        "\172\1\uffff\1\111\1\122\1\uffff\1\103\1\172\1\105\3\uffff\1\172"+
        "\1\126\1\114\1\104\1\uffff\1\172\1\uffff\1\122\1\124\1\125\1\172"+
        "\1\uffff\2\105\1\104\1\116\2\105\1\122\1\uffff\1\107\1\172\1\uffff"+
        "\1\172\2\uffff\1\172\1\uffff\1\114\1\uffff\1\117\1\uffff\1\105\2"+
        "\uffff\1\101\2\uffff\1\111\2\uffff\1\124\1\172\1\uffff\1\124\1\126"+
        "\1\117\1\120\1\104\1\uffff\1\123\1\uffff\1\172\1\117\1\122\1\111"+
        "\1\105\1\uffff\1\131\1\uffff\1\172\1\uffff\1\105\1\122\1\124\3\uffff"+
        "\1\172\1\uffff\2\172\1\116\1\105\3\172\1\uffff\1\111\3\uffff\1\114"+
        "\1\172\1\131\1\172\1\105\1\120\1\122\1\172\1\uffff\1\115\1\uffff"+
        "\1\120\1\104\1\101\1\172\2\uffff\1\111\1\122\1\uffff\1\105\1\uffff"+
        "\1\172\1\uffff\1\126\1\115\1\124\1\uffff\1\122\1\uffff\1\105\2\172"+
        "\1\uffff\1\131\1\172\1\124\1\uffff\1\104\2\172\1\103\2\172\1\124"+
        "\1\172\3\uffff\1\124\1\120\1\106\1\102\1\103\1\101\1\uffff\1\172"+
        "\1\105\1\111\1\105\1\172\1\124\1\uffff\1\116\1\105\1\117\2\172\1"+
        "\uffff\1\101\1\111\1\172\2\uffff\1\124\1\104\1\uffff\1\101\1\172"+
        "\3\uffff\1\117\1\111\1\uffff\1\172\1\uffff\1\104\1\114\1\124\1\uffff"+
        "\3\172\1\124\1\172\1\uffff\1\126\1\115\1\172\1\uffff\1\105\1\101"+
        "\1\172\1\124\1\172\2\uffff\1\172\1\105\1\uffff\1\105\1\172\2\uffff"+
        "\1\131\1\172\2\uffff\1\111\1\uffff\1\111\1\105\1\111\1\114\1\123"+
        "\1\102\1\uffff\1\172\1\116\1\172\1\uffff\1\101\2\172\1\116\2\uffff"+
        "\1\104\1\124\1\uffff\1\101\1\172\1\124\1\uffff\1\116\1\132\1\uffff"+
        "\1\172\1\105\1\111\3\uffff\1\172\1\uffff\1\105\1\101\1\uffff\1\122"+
        "\1\124\1\uffff\1\111\2\uffff\1\123\1\172\1\uffff\1\172\1\uffff\1"+
        "\105\1\115\1\122\1\114\1\105\1\172\1\101\1\uffff\1\172\1\uffff\1"+
        "\115\1\172\1\104\2\uffff\1\172\2\105\1\124\1\uffff\1\105\1\172\1"+
        "\105\1\uffff\1\172\1\105\1\uffff\1\122\1\124\2\172\1\105\1\172\2"+
        "\uffff\1\123\1\105\1\124\1\105\1\172\1\uffff\1\123\1\uffff\1\120"+
        "\1\uffff\1\172\1\uffff\2\122\1\125\1\172\1\uffff\1\104\1\uffff\1"+
        "\123\2\172\2\uffff\1\123\1\uffff\2\172\1\111\1\172\1\uffff\1\105"+
        "\1\172\1\uffff\2\172\1\123\1\uffff\2\172\2\uffff\1\172\2\uffff\1"+
        "\105\1\uffff\1\172\3\uffff\1\172\3\uffff\1\123\2\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\31\uffff\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3"+
        "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\2\uffff\1\u00ee\1\u00ef\1\uffff"+
        "\1\u00f1\1\u00f2\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\4\uffff"+
        "\1\u0101\1\u0102\1\u0103\34\uffff\1\u00e9\1\6\101\uffff\1\147\1"+
        "\u0093\1\u0092\1\u00f9\2\uffff\1\u00eb\1\u00ec\1\u00ed\1\u0104\1"+
        "\u00f0\7\uffff\1\u0100\15\uffff\1\106\21\uffff\1\22\11\uffff\1\173"+
        "\1\uffff\1\5\1\uffff\1\36\20\uffff\1\u00a6\2\uffff\1\10\1\70\30"+
        "\uffff\1\16\111\uffff\1\u00e8\1\u00ea\1\uffff\1\u00fa\2\uffff\1"+
        "\u00fe\1\u00fd\1\u00ff\1\u00fc\17\uffff\1\u00d9\11\uffff\1\176\1"+
        "\12\2\uffff\1\3\2\uffff\1\4\3\uffff\1\172\24\uffff\1\113\6\uffff"+
        "\1\u0098\12\uffff\1\u00f3\33\uffff\1\u008e\14\uffff\1\u00ae\12\uffff"+
        "\1\u009d\2\uffff\1\u00ce\25\uffff\1\135\24\uffff\1\125\4\uffff\1"+
        "\u00fb\4\uffff\1\u0096\3\uffff\1\1\12\uffff\1\35\1\uffff\1\21\15"+
        "\uffff\1\71\1\63\1\uffff\1\u00b0\2\uffff\1\u009f\1\7\3\uffff\1\33"+
        "\3\uffff\1\133\10\uffff\1\u0097\15\uffff\1\13\3\uffff\1\66\1\uffff"+
        "\1\117\2\uffff\1\102\3\uffff\1\u00bf\7\uffff\1\u0095\2\uffff\1\u0089"+
        "\1\uffff\1\u00db\1\uffff\1\u00c7\2\uffff\1\61\10\uffff\1\50\10\uffff"+
        "\1\u00af\5\uffff\1\u00a1\4\uffff\1\32\3\uffff\1\u00b8\12\uffff\1"+
        "\136\3\uffff\1\175\1\uffff\1\u0094\7\uffff\1\u00d7\7\uffff\1\51"+
        "\1\146\1\u00a5\4\uffff\1\41\1\uffff\1\u00c9\6\uffff\1\77\2\uffff"+
        "\1\u00a3\1\uffff\1\2\1\115\1\123\1\uffff\1\74\1\uffff\1\100\1\uffff"+
        "\1\27\1\uffff\1\14\3\uffff\1\u00b1\1\uffff\1\54\1\150\1\u008d\7"+
        "\uffff\1\44\1\145\31\uffff\1\15\1\u00ac\10\uffff\1\20\1\u00b7\1"+
        "\uffff\1\u0088\20\uffff\1\62\1\uffff\1\u008f\3\uffff\1\56\5\uffff"+
        "\1\u00ba\2\uffff\1\u00b9\12\uffff\1\u0080\1\34\1\u00bb\12\uffff"+
        "\1\u00c1\3\uffff\1\u00a2\4\uffff\1\42\7\uffff\1\137\1\141\7\uffff"+
        "\1\u00cf\4\uffff\1\67\2\uffff\1\25\3\uffff\1\65\1\104\1\163\4\uffff"+
        "\1\64\1\uffff\1\11\4\uffff\1\u00a0\7\uffff\1\116\2\uffff\1\171\1"+
        "\uffff\1\u00c0\1\114\1\uffff\1\u00bd\1\uffff\1\17\1\uffff\1\23\1"+
        "\uffff\1\132\1\122\1\uffff\1\124\1\151\1\uffff\1\u00d5\1\u00b3\2"+
        "\uffff\1\u00aa\5\uffff\1\u00b2\1\uffff\1\u00d2\5\uffff\1\155\1\uffff"+
        "\1\u00ad\1\uffff\1\52\3\uffff\1\103\1\u0081\1\127\1\uffff\1\u00d6"+
        "\7\uffff\1\76\1\uffff\1\u00c3\1\72\1\75\10\uffff\1\u00c4\1\uffff"+
        "\1\111\4\uffff\1\u00ca\1\u00bc\2\uffff\1\162\1\uffff\1\166\1\uffff"+
        "\1\u00c8\3\uffff\1\45\1\uffff\1\143\3\uffff\1\u0084\3\uffff\1\164"+
        "\10\uffff\1\134\1\110\1\u00be\6\uffff\1\u00ab\6\uffff\1\174\5\uffff"+
        "\1\177\3\uffff\1\46\1\u00d4\2\uffff\1\57\2\uffff\1\107\1\u00cc\1"+
        "\43\2\uffff\1\u0099\1\uffff\1\154\3\uffff\1\u00dc\5\uffff\1\u0083"+
        "\3\uffff\1\167\5\uffff\1\73\1\u0085\2\uffff\1\24\2\uffff\1\101\1"+
        "\u008a\2\uffff\1\u00a7\1\120\1\uffff\1\u00da\6\uffff\1\112\3\uffff"+
        "\1\u00b6\4\uffff\1\31\1\165\2\uffff\1\u00d3\3\uffff\1\u00c2\2\uffff"+
        "\1\u0082\3\uffff\1\55\1\121\1\u0086\1\uffff\1\47\2\uffff\1\26\2"+
        "\uffff\1\u00a4\1\uffff\1\u00b4\1\53\2\uffff\1\140\1\uffff\1\u00a8"+
        "\7\uffff\1\u00cb\1\uffff\1\126\3\uffff\1\37\1\u00b5\4\uffff\1\131"+
        "\3\uffff\1\142\2\uffff\1\152\6\uffff\1\60\1\u0087\5\uffff\1\u00cd"+
        "\1\uffff\1\30\1\uffff\1\40\1\uffff\1\105\4\uffff\1\144\1\uffff\1"+
        "\170\3\uffff\1\160\1\156\1\uffff\1\u00d8\4\uffff\1\u009a\2\uffff"+
        "\1\130\3\uffff\1\u00d0\2\uffff\1\161\1\157\1\uffff\1\u008c\1\u009b"+
        "\1\uffff\1\153\1\uffff\1\u009e\1\u00c5\1\u00c6\1\uffff\1\u00a9\1"+
        "\u0090\1\u0091\1\uffff\1\u00d1\1\u009c\1\uffff\1\u008b";
    static final String DFA24_specialS =
        "\u04c8\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\66\2\uffff\1\66\22\uffff\1\66\1\6\1\61\1\uffff\1\27\1\52"+
            "\1\53\1\60\1\35\1\36\1\51\1\47\1\33\1\50\1\31\1\46\1\62\11\63"+
            "\1\32\1\34\1\44\1\43\1\45\1\57\1\uffff\1\3\1\14\1\24\1\12\1"+
            "\11\1\2\1\13\1\15\1\10\1\22\1\26\1\7\1\25\1\5\1\4\1\21\1\64"+
            "\1\23\1\17\1\1\1\20\1\30\1\16\3\64\1\37\1\uffff\1\40\1\56\1"+
            "\65\33\64\1\41\1\55\1\42\1\54",
            "\1\70\1\72\2\uffff\1\67\2\uffff\1\71\1\75\5\uffff\1\73\2\uffff"+
            "\1\74",
            "\1\102\3\uffff\1\100\3\uffff\1\77\2\uffff\1\104\2\uffff\1\76"+
            "\2\uffff\1\103\2\uffff\1\101",
            "\1\105\1\uffff\1\112\5\uffff\1\110\1\uffff\1\111\3\uffff\1\107"+
            "\1\106",
            "\1\114\7\uffff\1\117\1\uffff\1\116\1\uffff\1\115\2\uffff\1\113"+
            "\1\120",
            "\1\121\5\uffff\1\122",
            "\1\123",
            "\1\127\3\uffff\1\130\3\uffff\1\126\5\uffff\1\125",
            "\1\133\1\uffff\1\134\1\137\5\uffff\1\136\1\131\4\uffff\1\135"+
            "\1\132",
            "\1\142\1\uffff\1\140\4\uffff\1\141\4\uffff\1\143",
            "\1\146\1\147\2\uffff\1\145\3\uffff\1\144\5\uffff\1\150\2\uffff"+
            "\1\151",
            "\1\152",
            "\1\157\3\uffff\1\156\5\uffff\1\155\5\uffff\1\153\3\uffff\1\154",
            "\1\161\15\uffff\1\160",
            "\1\162\1\163",
            "\1\172\1\uffff\1\164\2\uffff\1\170\2\uffff\1\167\1\uffff\1\173"+
            "\1\uffff\1\165\3\uffff\1\171\1\166",
            "\1\174\1\uffff\1\176\2\uffff\1\177\1\175",
            "\1\u0081\3\uffff\1\u0080\6\uffff\1\u0082\5\uffff\1\u0083\2\uffff"+
            "\1\u0084",
            "\1\u0085",
            "\1\u008b\1\uffff\1\u0086\1\uffff\1\u0087\3\uffff\1\u008a\2\uffff"+
            "\1\u0089\2\uffff\1\u0088",
            "\1\u008c\6\uffff\1\u0091\3\uffff\1\u008d\2\uffff\1\u008e\2\uffff"+
            "\1\u0090\2\uffff\1\u008f",
            "\1\u0092\7\uffff\1\u0093\11\uffff\1\u0094",
            "\1\u0095",
            "\1\u0097\5\uffff\1\u0096\12\uffff\1\u0098",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b\1\123",
            "\1\u009d",
            "",
            "",
            "\1\u009f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u00a1\1\u00a3\64\u00a1\1\u00a2\uffa2\u00a1",
            "\42\u00a4\1\u00a6\71\u00a4\1\u00a5\uffa2\u00a4",
            "\12\u00aa\7\uffff\1\64\1\u00ac\2\64\1\u00ae\1\64\1\u00ac\3\64"+
            "\1\u00ac\1\u00ad\1\u00ac\5\64\1\u00ab\4\64\1\u00a7\1\u00a9\1"+
            "\64\4\uffff\1\64\1\uffff\1\64\1\u00ac\2\64\1\u00ae\1\64\1\u00ac"+
            "\3\64\1\u00ac\1\64\1\u00ac\15\64",
            "\12\u00aa\7\uffff\1\64\1\u00ac\2\64\1\u00ae\1\64\1\u00ac\3\64"+
            "\1\u00ac\1\u00ad\1\u00ac\5\64\1\u00ab\5\64\1\u00a9\1\64\4\uffff"+
            "\1\64\1\uffff\1\64\1\u00ac\2\64\1\u00ae\1\64\1\u00ac\3\64\1"+
            "\u00ac\1\64\1\u00ac\15\64",
            "",
            "",
            "",
            "\1\u00af\4\uffff\1\u00b1\5\uffff\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\64\7\uffff\24\64\1\u00b5\5\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b9\7\uffff\1\u00b8\13\uffff\1\u00b7",
            "\1\u00bb\1\u00ba",
            "\1\u00bc",
            "\1\u00be\6\uffff\1\u00bf\5\uffff\1\u00bd",
            "\1\u00c0",
            "\1\u00c2\1\uffff\1\u00c1",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\64\7\uffff\2\64\1\u00c7\27\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ca\16\uffff\1\u00c9",
            "\1\u00cb\7\uffff\1\u00cc",
            "\1\u00cd\2\uffff\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\64\7\uffff\5\64\1\u00d1\24\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\3\64\1\u00d3\26\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d7",
            "\1\u00d8\12\uffff\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\1\u00db\1\uffff\1\u00dc\12\uffff\1\u00dd",
            "\1\u00de\1\uffff\1\u00e0\1\u00df",
            "\1\u00e1",
            "\1\u00e2",
            "\12\64\7\uffff\3\64\1\u00e6\13\64\1\u00e3\2\64\1\u00e4\1\u00e5"+
            "\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e8",
            "\1\u00e9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee\2\uffff\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2\5\uffff\1\u00f5\6\uffff\1\u00f4\3\uffff\1\u00f3",
            "\1\u00f6\1\u00f7\2\uffff\1\u00f8",
            "\1\u00fb\5\uffff\1\u00f9\3\uffff\1\u00fc\2\uffff\1\u00fa",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0102\15\uffff\1\u0101",
            "\1\u0103",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0106\4\uffff\1\u0105",
            "\1\u0108\6\uffff\1\u0107",
            "\1\u010a\15\uffff\1\u0109",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d\3\uffff\1\u010e",
            "\1\u010f",
            "\1\u0112\1\u0113\3\uffff\1\u0114\1\u0110\1\uffff\1\u0111",
            "\1\u0115",
            "\1\u0118\15\uffff\1\u0117\2\uffff\1\u0116",
            "\1\u0119",
            "\1\u011a\15\uffff\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f\2\uffff\1\u0123\4\uffff\1\u0120\2\uffff\1\u0122\6\uffff"+
            "\1\u0121",
            "\1\u0124",
            "\1\u0125",
            "\1\u0127\3\uffff\1\u0126",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012c\11\uffff\1\u012b",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130\1\u0138\1\u0133\1\u0137\2\uffff\1\u0136\6\uffff\1\u0135"+
            "\1\uffff\1\u0132\2\uffff\1\u0134\2\uffff\1\u0131",
            "\1\u0139\12\uffff\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0142\1\u0141\1\u0140",
            "\1\u0143\17\uffff\1\u0144",
            "\1\u0145\11\uffff\1\u0146",
            "\1\u0147",
            "\1\u0149\3\uffff\1\u0148",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "",
            "",
            "\1\u014d",
            "\1\u014e",
            "",
            "",
            "",
            "",
            "",
            "\47\u00a1\1\u00a3\64\u00a1\1\u00a2\uffa2\u00a1",
            "\uffff\u0150",
            "\1\61\4\uffff\1\60",
            "\42\u00a4\1\u00a6\71\u00a4\1\u00a5\uffa2\u00a4",
            "\uffff\u0152",
            "\1\61\4\uffff\1\60",
            "\12\u0153\7\uffff\6\u0153\32\uffff\6\u0153",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\u00aa\7\uffff\1\64\1\u00ac\2\64\1\u00ae\1\64\1\u00ac\3\64"+
            "\1\u00ac\1\u00ad\1\u00ac\5\64\1\u00ab\5\64\1\u00a9\1\64\4\uffff"+
            "\1\64\1\uffff\1\64\1\u00ac\2\64\1\u00ae\1\64\1\u00ac\3\64\1"+
            "\u00ac\1\64\1\u00ac\15\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a8\1\uffff\1\u00a8\2\uffff\12\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0161\10\uffff\1\u0160",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\64\7\uffff\14\64\1\u0166\15\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0173",
            "\1\u0174",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0176",
            "\1\u0177",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0179",
            "\12\64\7\uffff\4\64\1\u017b\12\64\1\u017a\12\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u017d",
            "",
            "\1\u017e",
            "",
            "\1\u017f",
            "",
            "\1\u0180",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0185\11\uffff\1\u0184",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c\23\uffff\1\u018d",
            "\1\u018e",
            "\12\64\7\uffff\4\64\1\u0190\11\64\1\u018f\13\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "",
            "",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019e\2\uffff\1\u019d",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a2\22\uffff\1\u01a1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01a4\3\uffff\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9\3\uffff\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9\3\uffff\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\64\7\uffff\22\64\1\u01be\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c5\3\uffff\1\u01c4\13\uffff\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d1\1\uffff\1\u01d0",
            "\1\u01d3\3\uffff\1\u01d2",
            "\1\u01d4",
            "\1\u01d5",
            "\12\64\7\uffff\32\64\4\uffff\1\u01d6\1\uffff\32\64",
            "\1\u01d8",
            "\1\u01d9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de\20\uffff\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e7\12\uffff\1\u01e6",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\12\64\7\uffff\22\64\1\u01ef\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f5\1\uffff\1\u01f6\16\uffff\1\u01f4",
            "\1\u01f7",
            "\1\u01f8\20\uffff\1\u01f9",
            "\1\u01fa\2\uffff\1\u01fb",
            "\1\u01fd\10\uffff\1\u01fc",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\12\64\7\uffff\11\64\1\u0204\20\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "",
            "",
            "\47\u00a1\1\u00a3\64\u00a1\1\u00a2\uffa2\u00a1",
            "",
            "\42\u00a4\1\u00a6\71\u00a4\1\u00a5\uffa2\u00a4",
            "\12\u0153\7\uffff\6\u0153\24\64\4\uffff\1\64\1\uffff\6\u0153"+
            "\24\64",
            "",
            "",
            "",
            "",
            "\12\u0158\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u021f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0221",
            "",
            "",
            "\1\u0222",
            "\1\u0223",
            "",
            "\1\u0224",
            "\1\u0225",
            "",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\22\64\1\u0230\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0233\7\uffff\1\u0232",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u023e",
            "",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "",
            "\1\u0245",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0247",
            "\1\u0249\3\uffff\1\u0248",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e\10\uffff\1\u024f",
            "\1\u0250",
            "",
            "\1\u0251",
            "\1\u0252",
            "\12\64\7\uffff\21\64\1\u0253\10\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0255",
            "\1\u0256",
            "\12\64\7\uffff\1\64\1\u0257\30\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\23\64\1\u0259\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u025b",
            "\1\u025c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u026a",
            "\1\u026b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u026d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u026f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0271",
            "\12\64\7\uffff\4\64\1\u0272\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\12\64\7\uffff\32\64\4\uffff\1\u027b\1\uffff\32\64",
            "",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0286",
            "",
            "\1\u0287",
            "\1\u0288",
            "",
            "\1\u0289",
            "\1\u028a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0291",
            "\12\64\7\uffff\16\64\1\u0292\3\64\1\u0293\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02a4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "",
            "\1\u02b4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\12\64\7\uffff\22\64\1\u02bb\7\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02bd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02bf",
            "",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02c6",
            "\1\u02c7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02c9",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02cd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02cf",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02d1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02d3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02d9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02dd",
            "",
            "\1\u02de",
            "\1\u02df\1\uffff\1\u02e0",
            "\1\u02e1",
            "",
            "\1\u02e2",
            "\12\64\7\uffff\4\64\1\u02e3\25\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "",
            "\1\u02fb",
            "",
            "\1\u02fc",
            "\1\u02fd",
            "",
            "\12\64\7\uffff\10\64\1\u02fe\21\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0301",
            "",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\17\64\1\u030b\12\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u030d",
            "",
            "\1\u030e",
            "\1\u030f",
            "",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\12\64\7\uffff\23\64\1\u031c\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u031e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0320",
            "",
            "\1\u0321",
            "\1\u0322",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0324",
            "\1\u0325",
            "",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u032a",
            "\1\u032b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u033a",
            "",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "",
            "\1\u0342",
            "\1\u0343",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\12\64\7\uffff\1\u034c\31\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u034e",
            "",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "\12\64\7\uffff\23\64\1\u0354\6\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0357",
            "",
            "\1\u0358",
            "",
            "",
            "",
            "\1\u0359",
            "",
            "\1\u035a",
            "",
            "\1\u035b\1\uffff\1\u035c",
            "",
            "\1\u035d",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u035f",
            "\1\u0360",
            "",
            "\1\u0361",
            "",
            "",
            "",
            "\1\u0362",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0364",
            "\1\u0365",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0367",
            "\1\u0368",
            "",
            "",
            "\1\u0369",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0372",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0381",
            "",
            "",
            "\12\64\7\uffff\22\64\1\u0382\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0384",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0387",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0389",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u038b",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u038d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0390",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0393",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0396",
            "\12\64\7\uffff\22\64\1\u0397\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "",
            "\1\u039d",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u039f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03a7",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03a9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03ab\4\uffff\1\u03ac",
            "\1\u03ad",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03b1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u03b3",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03b8",
            "\12\64\7\uffff\22\64\1\u03b9\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03bb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03bf",
            "\1\u03c0",
            "",
            "\1\u03c1",
            "\1\u03c2",
            "\1\u03c3",
            "\1\u03c4",
            "",
            "\1\u03c5",
            "\1\u03c6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03c8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03ca",
            "\1\u03cb",
            "",
            "",
            "\1\u03cc",
            "\1\u03cd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03d0",
            "\1\u03d1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03d3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03d5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03d7",
            "\1\u03d8",
            "",
            "\1\u03d9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03db",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03dd",
            "\1\u03de",
            "\1\u03df",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03e5",
            "\1\u03e6",
            "\1\u03e7",
            "\1\u03e8",
            "\1\u03e9",
            "\1\u03ea",
            "\1\u03eb",
            "",
            "\1\u03ec",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03f0",
            "",
            "\1\u03f1",
            "",
            "\1\u03f2",
            "",
            "",
            "\1\u03f3",
            "",
            "",
            "\1\u03f4",
            "",
            "",
            "\1\u03f5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "",
            "\1\u03fc",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03fe",
            "\1\u03ff",
            "\1\u0400",
            "\1\u0401",
            "",
            "\1\u0402",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\4\64\1\u040a\15\64\1\u0409\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u040c",
            "\1\u040d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0411",
            "",
            "",
            "",
            "\1\u0412",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0414",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0416",
            "\1\u0417",
            "\1\u0418",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u041a",
            "",
            "\1\u041b",
            "\1\u041c",
            "\1\u041d",
            "\12\64\7\uffff\22\64\1\u041e\7\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0420",
            "\1\u0421",
            "",
            "\1\u0422",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0424",
            "\1\u0425",
            "\1\u0426",
            "",
            "\1\u0427",
            "",
            "\1\u0428",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u042c\17\uffff\1\u042b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u042e",
            "",
            "\1\u042f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0432",
            "\12\64\7\uffff\22\64\1\u0433\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0436",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u0438",
            "\1\u0439",
            "\1\u043a",
            "\1\u043b",
            "\1\u043c",
            "\1\u043d",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u043f",
            "\1\u0440",
            "\1\u0441",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0443",
            "",
            "\1\u0444",
            "\1\u0445",
            "\1\u0446",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0449",
            "\1\u044a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u044c",
            "\1\u044d",
            "",
            "\1\u044e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u0450",
            "\1\u0451",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0453",
            "\1\u0454",
            "\1\u0455",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0459",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u045b",
            "\1\u045c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u045e",
            "\1\u045f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0461",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0464",
            "",
            "\1\u0465",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0467",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0469",
            "",
            "\1\u046a",
            "\1\u046b",
            "\1\u046c",
            "\1\u046d",
            "\1\u046e",
            "\1\u046f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0471",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0473",
            "\12\64\7\uffff\4\64\1\u0475\15\64\1\u0474\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0478",
            "",
            "",
            "\1\u0479",
            "\1\u047a",
            "",
            "\1\u047b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u047d",
            "",
            "\1\u047e",
            "\1\u047f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0481",
            "\1\u0482",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0484",
            "\1\u0485",
            "",
            "\1\u0486",
            "\1\u0487",
            "",
            "\1\u0488",
            "",
            "",
            "\1\u0489",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u048c",
            "\1\u048d",
            "\1\u048e",
            "\1\u048f",
            "\1\u0490",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0492",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0494",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0496",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0498",
            "\1\u0499",
            "\1\u049a",
            "",
            "\1\u049b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u049d",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u049f",
            "",
            "\1\u04a0",
            "\1\u04a1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04a4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04a6",
            "\1\u04a7",
            "\1\u04a8",
            "\1\u04a9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04ab",
            "",
            "\1\u04ac",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04ae",
            "\1\u04af",
            "\1\u04b0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04b2",
            "",
            "\1\u04b3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04b6",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04b9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04bb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04bf",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04c3",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u04c6",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_STRING | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_DEPENDENCY | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
        }
    }
 

}