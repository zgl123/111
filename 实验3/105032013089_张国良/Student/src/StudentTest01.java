

import junit.framework.TestCase;

public class StudentTest01 extends TestCase
{

    student testStudent;
    //�˷�����ִ��ÿһ�����Է���֮ǰ������������֮ǰ����
    @Override
    protected void setUp() throws Exception
    {
        // TODO Auto-generated method stub
        super.setUp();
        testStudent = new student("djm", "boy", 178, 24, "��������");
    }

    //�˷�����ִ��ÿһ�����Է���֮�����
    @Override
    protected void tearDown() throws Exception
    {
        // TODO Auto-generated method stub
        super.tearDown();
    }

    //��������������Person�����getSex()����
    public void testGetSex()
    {
        assertEquals("boy", testStudent.getSex());
        System.out.println("-------�ӿڲ���--------");
        System.out.println("testGetSex()�����yԇ�ɹ�");
        assertEquals(24, testStudent.getAge());
        System.out.println("testGetAge()�����yԇ�ɹ�");
    }
    
    //���Ա߽�
    public void testboder(){
        System.out.println("-------�߽���������--------");
    	  System.out.println("��������66��");
    	  System.out.println(testStudent.setAge(66));
    	  assertFalse(testStudent.setAge(66));
    }
    //�����ݴ���
    public void testfalse(){
        System.out.println("-------�ݴ��Բ���--------");
    	  System.out.println("��������-6��");
    	  assertFalse(testStudent.setAge(-6));
    }
}
