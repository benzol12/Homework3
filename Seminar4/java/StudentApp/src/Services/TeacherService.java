package Services;

import java.util.ArrayList;
import java.util.List;


import Domain.PersonComparator;
import Domain.Teacher;

/* Создаем класс и подключаем к нему интерфейс iPersonService */
public class TeacherService implements iPersonService<Teacher>  {

    /* Добавляем поля:
     количества учителей;
     список учителей. */
    private int count;
    private List<Teacher> teachers;


    public TeacherService(List<Teacher> teachers) {
        this.teachers = new ArrayList<>();
    }


    @Override
    public List<Teacher> getAll() {
        return teachers;
    }


    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "Professor");
        count++;
        teachers.add(teacher);
    }

    /* Добавляем метод сортировки */

    public void sortByFIO(){
        PersonComparator <Teacher>comparator = new PersonComparator<Teacher>();
        teachers.sort(comparator);
    }


    @Override
    public void print(List<Teacher> group) {
    for (Teacher t : group){
        System.out.println(t);
    }
    }



    
  
}