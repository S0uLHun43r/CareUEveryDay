package cn.ofpp;

import cn.hutool.core.util.StrUtil;
import cn.ofpp.core.Wx;

/**
 * 引导配置
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Bootstrap {

    /**
     * 公众号AppID
     */
    public static final String APP_ID = "wx9607dbaa2499b611";

    /**
     * 公众号秘钥
     */
    public static final String SECRET = "a817ad15799428c933997926274076fd";

    /**
     * 全局模板ID  也可针对单个Friend指定模板
     */
    public static final String TEMPLATE_ID = "Ewnex-DqBEOBkVdoQsqQvDZ94W7tog2fBTstu48c6To";

    /**
     * 初始化
     */
    public static void init() {
        if (StrUtil.hasEmpty(APP_ID, SECRET, TEMPLATE_ID)) {
            throw new IllegalArgumentException("请检查配置");
        }
        Wx.init();
    }

}
