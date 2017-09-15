import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/5/9
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TableCreate {

    private ProcessEngine pe;

    @Before
    public void before() {
        System.out.println("######获取工作流引擎######");
        ProcessEngineConfiguration pec = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        pec.setJdbcDriver("com.mysql.jdbc.Driver");
        pec.setJdbcUrl("jdbc:mysql://172.20.4.206:3306/csj_db?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=utf8");
        pec.setJdbcUsername("root");
        pec.setJdbcPassword("123456");
        pec.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        pe = pec.buildProcessEngine();
    }

//    /**
//     * 创建工作流相关表
//     */
//    @Test
//    public void testACreateTable() {
//        System.out.println("######获取工作流引擎######");
//        ProcessEngineConfiguration pec = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
//        pec.setJdbcDriver("com.mysql.jdbc.Driver");
//        pec.setJdbcUrl("jdbc:mysql://172.20.4.206:3306/csj_db?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=utf8");
//        pec.setJdbcUsername("root");
//        pec.setJdbcPassword("123456");
//        pec.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
//        pe = pec.buildProcessEngine();
//        System.out.println(pe);
//    }

    @Test
    public void testBDeploymentProcessDefinition() {
        System.out.println("######部署流程定义######");
        Deployment deployment = pe.getRepositoryService().createDeployment().name("Hello World")
                .addClasspathResource("hello.bpmn").deploy();
        System.out.println("部署ID：" + deployment.getId());
        System.out.println("部署名称：" + deployment.getName());
    }

    @Test
    public void testCStartProcessInstance() {
        System.out.println("######启动流程实例######");
        String processKey = "helloProcess";
        ProcessInstance pi = pe.getRuntimeService().startProcessInstanceByKey(processKey);

        System.out.println("流程实例ID：" + pi.getId());
        System.out.println("流程定义ID：" + pi.getProcessDefinitionId());
    }

    private String taskId = "";

    @Test
    public void testDFindCurTask() {
        System.out.println("######查询个人代办任务######");
        String assignee = "张三";
        List<Task> tasks = pe.getTaskService().createTaskQuery().taskAssignee(assignee).list();

        if (null != tasks && tasks.size() > 0) {
            for (Task task : tasks) {
                System.out.println("任务ID:" + task.getId());
                taskId = task.getId();
                System.out.println("任务名称:" + task.getName());
                System.out.println("任务的创建时间" + task);
                System.out.println("任务的办理人:" + task.getAssignee());
                System.out.println("流程实例ID:" + task.getProcessInstanceId());
                System.out.println("执行对象ID:" + task.getExecutionId());
                System.out.println("流程定义ID:" + task.getProcessDefinitionId());
            }
        }
    }

    @Test
    public void testECompleteMyPersonalTask() {
        System.out.println("######完成任务######");
        System.out.println("任务ID：" + taskId);
        pe.getTaskService().complete(taskId);
    }
}
