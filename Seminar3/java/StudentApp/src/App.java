import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);

        /* Добавлен новый список*/
        List<Student> listStud2 = new ArrayList<Student>();
        
        listStud2.add(s5);
        listStud2.add(s6);

        StudentGroup group5830 = new StudentGroup(listStud, 5830);
        System.out.println(group5830);

        /* Добавлена новая группа*/
        StudentGroup group5831 = new StudentGroup(listStud, 5831);
        System.out.println(group5831);

        /* Добавлен список групп*/
        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group5830);
        listGroup.add(group5831);


        for(Student std : group5830)
        {
            System.out.println(std);
        }

        /* Перебираем группу для вывода студентов на терминал*/
        for(Student std : group5831)
        {
            System.out.println(std);
        }

        /* Перебираем группы для из вывода на терминал*/
        for(StudentGroup gr : listGroup)
        {
            System.out.println(gr);
        }

        /* Добавляем новый полток*/
        StudentSteam steam1 = new StudentSteam(listGroup, 111);

        for(StudentGroup gr1 : steam1)
        {
            System.out.println(gr1);
        }



        System.out.println("=========================================================");

        Collections.sort(group5830.getGroup());

        for(Student std: group5830.getGroup())
        {
            System.out.println(std);
        }

        Collections.sort(steam1.getSteam());
        for(StudentGroup gr1 : steam1)
        {
            System.out.println(gr1);
        }
    }
}
