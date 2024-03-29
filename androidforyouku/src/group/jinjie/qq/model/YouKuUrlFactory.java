package group.jinjie.qq.model;

import group.jinjie.qq.util.ConstantsUtility;

public abstract class YouKuUrlFactory implements IUrlFactory {
    public static final String mPidStr = "pid=72dcbabf24935d13"; 
    public static final String mPzStr = "pz=10";
    public static final String mRtStr = "rt=1";
    public static final String mFStr = "f=7";
    public static final String mLenStr = "len=120";
    
    public abstract String newUrlInstance();
    
    public  String bulidUrl(String... paras) {
        StringBuilder builder = new StringBuilder();
        builder.append(ConstantsUtility.YOUKU_BASE_URL);
        builder.append(paras[0]);
        builder.append("?");
        
        int len = paras.length;
        for(int i = 1; i< len; i++) {
            builder.append(paras[i]);
            if(i == len -1) break;
            builder.append("&");
        }
        
        return builder.toString();
    }
    
}
