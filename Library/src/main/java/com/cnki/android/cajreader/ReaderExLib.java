package com.cnki.android.cajreader;

public class ReaderExLib {

	static {
        System.loadLibrary("readerex");
    }
	//public enum CAJ_DOCUMENT_TYPE
	//{
	public static final int	DOC_UNKNOWN = 0;
	public static final int DOC_CAJ = 1;
	public static final int DOC_NH = 2;
	public static final int DOC_PDF = 3;
	public static final int DOC_KDH = 4;
	public static final int DOC_CAS = 5;
	public static final int DOC_TEB = 8;
	public static final int DOC_TEB_V2 = 9;
	public static final int	DOC_TEB_V3 = 10;
	public static final int DOC_TEB_V4 = 14;
	public static final int DOC_CAJ3 = 27;
	//};
	//打开文件错误码
	public static final int CAJFILE_NO_ERROR=0;
	public static final int CAJFILE_OPEN_ERROR=1;
	public static final int CAJFILE_TYPE_ERROR=2;
	public static final int CAJFILE_CIPHER_ERROR=3;		// Cipher check error, must be update.
	public static final int CAJFILE_PAGE_INDEX_ERROR=4;
	public static final int CAJFILE_ALLOC_BUFFER_ERROR=5;
	public static final int CAJFILE_UNCOMPRESS_DATA_ERROR=6;
	public static final int CAJFILE_CANNOT_READ_XREF=7;
	public static final int CAJFILE_CANNOT_READ_PAGE=8;
	public static final int CAJFILE_FILE_VERSION_ERROR=9;
	public static final int CAJFILE_XREF_ERROR=10;
	public static final int CAJFILE_IO_ERROR=11;
	public static final int CAJFILE_UNKNOWN_ERROR=12;				//未知错误
	public static final int CAJFILE_REQUIRED_USER_PASSWD=13;		//需要打开密码
	public static final int CAJFILE_INACTIVE=14;					//需要激活
	public static final int CAJFILE_ERROR_ENCRYPT=15;				//错误的加密参数
	public static final int CAJFILE_REQUIRED_CERTIFICATE=16;		//需要证书验证
	public static final int CAJFILE_IO_OVERLAPPED=17;		    	//IO操作未完成
	public static final int CAJFILE_PASSWD_EXPIRED=18;				//密码已经过期
	public static final int CAJFILE_AUTH_UNKNOWN_ERROR=19;			//验证错误
	public static final int CAJFILE_AUTH_PASSWD_EXPIRED=20;		//密码已过期
	public static final int CAJFILE_AUTH_OPEN_TIMES_EXCEED=21;		//达到打开次数限制
	public static final int CAJFILE_AUTH_CANNOT_CONNECT_SERVER=22;	//连接验证服务器错误
	public static final int CAJFILE_AUTH_NO_RIGHTS_FILE=23;		//未找到权限文件
	public static final int CAJFILE_AUTH_RIGHTS_FILE_ERROR=24;		//权限文件错误
	public static final int CAJFILE_AUTH_SERVER_ERROR=25;			//服务器错误
	public static final int CAJFILE_AUTH_CLIENT_REQUEST_ERROR=26;	//服务器错误
	public static final int CAJFILE_NOT_FOUND_CERTIFICATE=27;		//未找到合适的证书
	public static final int CAJFILE_NOT_FOUND_CAJVD=28;			//未安装CAJVD
	public static final int CAJFILE_OPEN_CERTIFICATE_ERROR=29;		//无法打开证书文件或证书文件错误
	public static final int CAJFILE_OPEN_CAJVD_ERROR=30;			//无法打开CAJVD
	public static final int CAJFILE_MACHINE_NOT_REGISTERED=31;		//计算机未注册
	public static final int CAJFILE_READ_CAJVD_ERROR=32;			//无法读取CAJVD
	public static final int CAJFILE_ONLY_IN_USB_DISK=33;			//只能在指定的USB盘上打开
	public static final int CAJFILE_NOT_FOUND_USB_DISK=34;			//没有找到适合的USB盘
	public static final int CAJFILE_AUTH_RIGHTS_FILE_VER_ERROR=35;		//权限文件版本错误
	public static final int CAJFILE_AUTH_IP_ERROR=36;					//IP范围错误
	public static final int CAJFILE_AUTH_ERROR_UERNAME=37;				//用户名错误
	public static final int CAJFILE_AUTH_PT_ERROR=38;					//产品类型验证失败
	public static final int CAJFILE_AUTH_NOT_BEGIN_VALID=39;			//未到许可开始时间
	public static final int CAJFILE_AUTH_OVER_END_VALID=40;			//超过许可结束时间
    /***
     typedef enum  {
     PLS_NA,
     PLS_NLOAD,
     PLS_LOADING,
     PLS_LOAD,
     PLS_IMAGE_LOADING,
     PLS_IMAGE_LOAD
     }PAGE_LOAD_STATUS;
     */
    public static final int PLS_NLOAD = 1;
	public static final int PLS_LOAD = 3;
    public static final int PLS_IMAGE_LOAD = 5;

	public static final int ROW_SEL_P = 5;
	/*字符集*/
	//简体中文
	public static final int GB2312_CHARSET = 134;
	//繁体
	public static final int CHINESEBIG5_CHARSET = 136;
	//日文
	public static final int SHIFTJIS_CHARSET = 128;
	//韩文
	public static final int HANGEUL_CHARSET = 129;
	//GetDocInfoEx的type
	public static final int DIT_CATALOG_XML = 9;
	public static final int DIT_NET_FILE_SIZE = 10;
	public static final int DIT_NET_FILE_CUR_SIZE = 11;
	public static final int DIT_DOC_INFO = 12;
	public static final int DIT_DOC_PATH = 13;
	public static final int DIT_NET_FILE_CAN_PREDOWNLOAD = 14;
	public static final int DIT_DOC_PATHW = 15;
	public static final int DIT_DOC_DOWNLOAD_URL = 16;
	//消息类型
	public static final int NM_NOT_FOUND_COLLECTION		= 1;
	public static final int NM_REQURE_USER_PASSWORD		= 2;
	public static final int NM_NOT_FOUND_FONT			= 3;
	public static final int NM_NOT_FOUND_BUILDIN_FONT	= 4;
	public static final int NM_PAGE_LOAD				= 5;
	public static final int NM_CATALOG_DONE				= 6;
	public static final int NM_APPINFO_DONE				= 7;
	public static final int NM_DOWNLOAD_COMPLETE		= 8;
	public static final int NM_INTERNAL_FILE_LOAD		= 9;
	public static final int NM_NOT_FOUND_MAP_FONT		= 10;
	public static final int NM_PAGE_IMAGE_DONE          = 11;
    public static final int NM_PAGE_IMAGE2_DONE         = 12;
	//CloseEx参数
	public static final int FCA_CLEAR_CACHE = 1;

	public static final int ROTATE_FOR_RELAYOUT         = 3601;

	public static native String GetFontName(String file);
	//设置LOG文件全路径名，level为LOG级别，一般设为1
	public static native void SetLogPath(String path, int level);
	//初始化方法
    public static native void Init(String execDir, String[] fontDirs, String tmpDir);
    public static native void EnableDrawCache(long mem_cache_size, long mem_item_count, String cache_dir,
             int app_version, long file_cache_size, long file_item_count);
    public static native void Shutdown();
    //设置系统参数，
    public static native void SetSysMetrics(String name, String val);
    public static native boolean UnZip(String zipfile, String sourfile, String destfile);
    //设置各个字符集的默认字体
    public static native void SetBaseFontEx(String fontname, int charset);
    //设置回调函数对象，需实现public void onReaderMessage(int msg, int handle, int page)接口
    public static native void SetNotifyMessageCallback(Object obj);
    public static native void ReleaseNotifyMessageCallback(Object obj);
    //读取消息
    public static native void PeekMessage(Object obj);
    //刷新，暂时用不到
    public static native void Refresh(long handle, int type);
    //
	public static native long GetDocType(String file);
    public static native long OpenXML(String file);
    public static native void SetAutoXML(long handle, long handle1);
    //打开谁的，file为路径或URL
//    public static native long Open(String file);
//    public static native long Open1(String file, long err, boolean use_pageimage_cache);
//    public static CAJObject OpenEx(String file, boolean use_pageimage_cache) {
//		long err = NewErrorObject();
//		long handle = Open1(file, err, use_pageimage_cache);
//
//    	return new CAJObject(file, handle, err);
//    }
//    public static native long Open2(String file, long err, int type, int blockSize, String pwd, boolean use_pageimage_cache);
//    public static CAJObject OpenExPwd(String file, int cam, int blockSize, String pwd, boolean use_pageimage_cache) {
//		long err = NewErrorObject();
//		long handle = Open2(file, err, cam, blockSize, pwd, use_pageimage_cache);
//
//    	return new CAJObject(file, handle, err);
//    }
//    //
//    public static native long NewErrorObject();
//    public static native void ResetErrorObject();
//    public static native int GetErrorCode(long handle);
//    public static native void ReleaseErrorObject(long handle);
//    public static native boolean IsFileComplete(long handle);
//    //取得总页数
//    public static native int GetPageCount(long handle);
//    //取得文档信息
//    public static native byte[] GetDocInfoEx(long handle, int type);
//    //关闭
//    public static native void CloseEx(long handle, int type);
//    //public static native void CloseXML(long handle);
//    //页面预处理，主要用于URL文件
//    public static native int PreparePage(long handle, int page, boolean loadit);
//	public static native int PreparePageImage(long handle, int page, int rotate, int scale, int dpi, boolean loadit);
//    public static int PreparePageImage2(long handle, int page, int scale, int dpi, boolean loadit){
//        return PreparePageImage(handle, page, ROTATE_FOR_RELAYOUT, scale, dpi, loadit);
//    }
//    //选择文字
//    public static native  SelectTextObject SelectTextEx(long handle, int page, int x1, int y1, int x2, int y2, int sel_mod);
//    //取得页面大小
//    public static native int[] GetPageSize(long handle, int page);
//    public static native int[] GetPageSize1(long handle, int page);
//    //绘制页面到位图 PixmapObject 需要public void SetPixmap(int width, int height, int bits, int rowSize, int[] data)接口
//    public static native PixmapObject DrawPageSlice(long handle, int page, int colorType,
//    		 int rotate, int nScale, int sliceX, int sliceY, int sliceW,
//    		 int sliceH, int offsetX, int offsetY, int dpi);
//    public static native PixmapObject DrawPageSlice1(long handle, int page, int colorType,
//   		 int rotate, int nScale, int sliceX, int sliceY, int sliceW,
//   		 int sliceH, int offsetX, int offsetY, int dpi);
//    public static native PixmapObject DrawPageSlice2(long handle, long handle1, int page, int colorType,
//      		 int rotate, int nScale, int sliceX, int sliceY, int sliceW,
//      		 int sliceH, int offsetX, int offsetY, int dpi);
//    public static native PixmapObject GetPageImage(long handle, int page, int rotate, int nScale, int dpi);
//    public static PixmapObject GetPageImage2(long handle, int page, int nScale, int dpi) {
//        return GetPageImage(handle, page, ROTATE_FOR_RELAYOUT, nScale, dpi);
//    }
    //取得页面文本对象，需要实现public void AddLine(int chars, int ySize, int yMax, int[] xLeft, int xSize, String text)接口
    //public static native PageTextObject GetTextInfo(long handle, int page);
    //public static native CatalogItem GetCatalogEx(long handle);
    //取得文档目录XML
    public static native byte[] GetCatalogXML(long handle);
    //public static native FontList GetFontList();
    public static native void SetKey(String key);
    public static native void MallocTest(int size);

    public static native long DecryptRights(byte[] data);
    public static native int RightsGetErrorCode(long handle);
    public static native boolean RightsDecryptData(long handle, byte[] data);
    public static native void ReleaseRights(long handle);

    //public static native byte[] FindAll(long handle, String text, TextFindListener listener);
    
    public static native String CreateRequest(Object context, String data, long timest);
    
    private native int startInflating();
	private native void endInflating(int inflatorId);
	private native long inflate(int inflatorId, byte[] in, int inOffset, int inLength, byte[] out);

	//"Content-Encrypt" "Content-Key" "Content-Encrypt-block"
	public static native byte[] DecodeDocInfo(byte[] data, int enc, String password, int blocksize);

	public static native boolean GetAutoXML(String filename, String xml);
	public static native void ResetImageCache();
	public static native boolean DistillPage(String infile, String outfile);
}
//可以用GetDocInfoEx取得真实的下载地址

