

import junit.framework.TestCase;

public class StudentTest01 extends TestCase
{

    student testStudent;
    //此方法在执行每一个测试方法之前（测试用例）之前调用
    @Override
    protected void setUp() throws Exception
    {
        // TODO Auto-generated method stub
        super.setUp();
        testStudent = new student("djm", "boy", 178, 24, "华东政法");
    }

    //此方法在执行每一个测试方法之后调用
    @Override
    protected void tearDown() throws Exception
    {
        // TODO Auto-generated method stub
        super.tearDown();
    }

    //测试用例，测试Person对象的getSex()方法
    public void testGetSex()
    {
        assertEquals("boy", testStudent.getSex());
        System.out.println("-------接口测试--------");
        System.out.println("testGetSex()方法測試成功");
        assertEquals(24, testStudent.getAge());
        System.out.println("testGetAge()方法測試成功");
    }
    
    //测试边界
    public void testboder(){
        System.out.println("-------边界条件测试--------");
    	  System.out.println("输入年龄66岁");
    	  System.out.println(testStudent.setAge(66));
    	  assertFalse(testStudent.setAge(66));
    }
    //测试容错性
    public void testfalse(){
        System.out.println("-------容错性测试--------");
    	  System.out.println("输入年龄-6岁");
    	  assertFalse(testStudent.setAge(-6));
    }
}
