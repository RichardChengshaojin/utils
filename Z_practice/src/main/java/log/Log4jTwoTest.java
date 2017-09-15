package log;//package third.log;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.config.ConfigurationFactory;
//import org.apache.logging.log4j.core.config.ConfigurationSource;
//import org.apache.logging.log4j.core.config.Configurator;
//
//import java.io.IOException;
//import java.util.Map;
//import java.util.Properties;
//
///**
// * DEC
// *
// * @auther chengshaojin
// * @since 2016/12/5
// */
//public class Log4jTwoTest {
//
//    private final static Logger logger;
//
//    static {
//        // 自定义配置文件位置
//        String customizedPath ="log/log4j2.xml";
////        try {
////            Configurator.initialize(null, new ConfigurationSource(Log4jTwoTest.class.getClassLoader().getResourceAsStream(customizedPath)));
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        System.setProperty(ConfigurationFactory.CONFIGURATION_FILE_PROPERTY, customizedPath);
//        logger = LogManager.getLogger(Log4jTwoTest.class);
//    }
//
//    public static void main(String[] args) {
//        printLog(logger);
////        printSysProperties();
////        printEnvs();
//    }
//
//    public static void printLog(Logger logger) {
//        logger.trace("log4j2 trace");
//        logger.debug("log4j2 debug");
//        logger.info("log4j2 info");
//        logger.warn("log4j2 warn");
//        logger.error("log4j2 error");
//        logger.fatal("log4j2 fatal");
//    }
//
//    public static void printSysProperties() {
//        Properties ps = System.getProperties();
//
//        for (Map.Entry<Object, Object> entry : ps.entrySet()) {
//            System.out.println(String.format("%s==>%s", entry.getKey(), entry.getValue()));
//        }
//    }
//
//    public static void printEnvs() {
//        Map<String, String> envs = System.getenv();
//        for (String key : envs.keySet()) {
//            System.out.println(String.format("%s=>%s", key, envs.get(key)));
//        }
//    }
//}
