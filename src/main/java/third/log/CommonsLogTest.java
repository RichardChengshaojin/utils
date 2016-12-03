package third.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/3
 */
public class CommonsLogTest {

    private static final Log logger;
    static {
        // 设置系统属性
        String where = "C:\\Users\\chengshaojin.XGD\\Desktop\\logtest\\log.log";
//        String where = "STDOUT";
//        String where = "STDERR";
        System.setProperty("org.apache.commons.logging.diagnostics.dest", where);
        System.setProperty("org.apache.commons.logging.LogFactory", "org.apache.commons.logging.impl.LogFactoryImpl");

        logger = LogFactory.getLog(CommonsLogTest.class);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("org.apache.commons.logging.diagnostics.dest"));

        UseLogger.printAllKindsLogInfo(logger);
    }
}
