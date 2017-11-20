package referenceTransmission;

public class DeptEmp {
    public static void main(String args[]) {
        Dept dept = new Dept(10,"ACCOUNTING","NewYork");
        Emp empa = new Emp(1, "Majie","Engineer", 10000,10);
        Emp empb = new Emp(2, "Emma","Manager", 20000,20);
        Emp empc = new Emp(3, "Tony","Clerk", 30000,30);

        empa.setMgr(empb);
        empb.setMgr(empc);
//        empc.setMgr(empc);

        empa.setDept(dept);
        empb.setDept(dept);
        empc.setDept(dept);

        dept.setEmps(new Emp[] {empa,empb,empc});
        for(Emp e : empa.getDept().getEmps()) {
            System.out.println(e.getInfo());
            System.out.println("--------");
            if(e.getMgr() != null) {
                System.out.println(e.getMgr().getInfo());
            }
            System.out.println("=======================");
        }

//        System.out.println(empa.getDept().getInfo());

    }
}
class Dept {
    private int deptno;
    private String dname;
    private String loc;

    private Emp [] emps;


    //setter getter 无参构造 略
    public Dept(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
    public String getInfo() {
        return "部门编号：" + this.deptno + ", 名称：" + this.dname + ", 地址：" + this.loc;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }
    public Emp [] getEmps() {
        return this.emps;
    }
}
class Emp {
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;

    private Dept dept;

    private Emp mgr;

    //setter getter 无参构造 略
    public Emp(int empno, String ename, String job, double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }
    public String getInfo() {
        return "雇员编号:" + this.empno + ", 姓名：" + this.ename + ", 职位：" + this.job + ", 工资：" + this.sal + ",佣金" + this.comm;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public Dept getDept() {
        return this.dept;
    }
    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }

    public Emp getMgr() {
        return mgr;
    }
}
