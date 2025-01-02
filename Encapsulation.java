class Employeee {
    private int empid;

    public void setEmpid(int eid) {
        empid = eid;
    }

    public int getEmpid() {
        return empid;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Employeee e = new Employeee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}
