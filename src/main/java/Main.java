import java.time.LocalDateTime;
import java.util.*;


class main {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        exercise3();
    }

    public static void exercise1(){
        //Create 3 new objects
        Task task1=new Task("Task1","description1", Task.TaskCategory.cat1, LocalDateTime.MAX);
        Task task2=new Task("Task2","description2", Task.TaskCategory.cat2, LocalDateTime.MAX);
        Task task3=new Task("Task3","description3", Task.TaskCategory.cat3, LocalDateTime.MAX);

        //Create the empty list
        List<Task> listOfTasks= new ArrayList<>();

        //Add items to the list
        listOfTasks.add(task1);
        listOfTasks.add(task2);
        listOfTasks.add(task3);

        for (Task item:listOfTasks){
            System.out.println(item);
        }

        //Delete the last itemp of the list
        System.out.println("Delete the last item of the list:");
        listOfTasks.remove(listOfTasks.size()-1);
        for (Task item:listOfTasks){
            System.out.println(item);
        }

        //Find and print object on index 1
        System.out.println(listOfTasks.get(1));

    }

    public static void exercise2(){
        Map<String,Integer> romanToArabic = new HashMap<String,Integer>(){{
            put("I",1);
            put("II",2);
            put("III",3);
            put("IV",4);
            put("V",5);
            put("VI",6);
            put("VII",7);
            put("IIX",8);
            put("IX",9);
            put("X",10);
        }};

        Map<Integer,String> arabicToRoman = new HashMap<Integer,String>(){{
            put(1,"I");
            put(2,"II");
            put(3,"III");
            put(4,"IV");
            put(5,"V");
            put(6,"VI");
            put(7,"VII");
            put(8,"IIX");
            put(9,"IX");
            put(10,"X");
        }};

        System.out.println("Roman to Arabic -->");
        Scanner leer=new Scanner(System.in);
        String inputS= leer.nextLine();

        int value=romanToArabic.get(inputS).intValue();
        System.out.println("Roman:"+inputS+" Arabic: "+value);

        System.out.println("Arabic to Roman -->");
        int inputI= leer.nextInt();

        String valueS=arabicToRoman.get(inputI);
        System.out.println("Roman:"+inputI+" Arabic: "+valueS);

    }

    public static void exercise3(){
        Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3,4,5,6,7));

        //Union:
        Set<Integer> union= new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);

        System.out.println("UNION:"+union);

        //Intersection
        Set<Integer> intersection= new HashSet<>();
        for (int x : setA)
            if (setB.contains(x))
                intersection.add(x);

        System.out.println("Intersection:"+intersection);

        //Difference
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        System.out.println("Difference A B:"+difference);

        //Symetric difference
        Set<Integer> tmpA;
        Set<Integer> tmpB;

        tmpA = union;
        tmpB = intersection;
        Set<Integer> symetricDifference = new HashSet<>(tmpA);
        symetricDifference.removeAll(tmpB);
        System.out.println("Symetric difference: "+symetricDifference);
    }


}
