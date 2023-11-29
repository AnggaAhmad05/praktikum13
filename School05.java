public class School05 {
    public static void main(String[] args) { 

        String [] students1A ={"Anne", "Aldrian","Ali", "Arul",};
        String [] students1B ={"Bobby","Brian", "Brandon", "Bradly"};
        String [] students1C ={"Clara", "Chirs", "Chad", "Christopher"};
        String [] students1D ={"Daniel", "Dovan", "Dom"};
        
        display(students1A);
        display(students1B);
        display(students1C);
        display(students1D);
    }
    public static void display (String[] students){
        System.out.printf("+++++++++++++++++++++++++%n");
        System.out.printf("| %-3s | %-15s |%n", "NO","NAME");
        System.out.printf("+++++++++++++++++++++++++%n");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i+1),students[i] );
            
        }
        System.out.printf("+++++++++++++++++++++++++%n%n");
    }
}
