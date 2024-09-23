package com.workintech.developers;

public class HRManager extends  Employee{
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public void addEmployee(JuniorDeveloper juniorDeveloper) {

        for (int i = 0; i < juniorDevelopers.length; i++) {

            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                return;
            }
        }

        System.out.println("JuniorDeveloper'lar için dizi dolu, yeni çalışan eklenemedi.");
    }

    public void addEmployee(MidDeveloper midDeveloper) {

        for (int i = 0; i < midDevelopers.length; i++) {

            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                return;
            }
        }


        System.out.println("MidDeveloper'lar için dizi dolu, yeni çalışan eklenemedi.");
    }


    public void addEmployee(SeniorDeveloper seniorDeveloper) {

        for (int i = 0; i < seniorDevelopers.length; i++) {
            // Boş bir index bul
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                return;
            }
        }

        System.out.println("SeniorDeveloper'lar için dizi dolu, yeni çalışan eklenemedi.");
    }

}
