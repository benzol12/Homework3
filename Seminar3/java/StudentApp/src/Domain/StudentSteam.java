package Domain;

import java.util.Iterator;
import java.util.List;

/* Создаем класс. С нужными полями */
public class StudentSteam implements Iterable<StudentGroup>, List<T> {
    private List<StudentGroup> steam;
    private Integer steamNumber;

    public StudentSteam(List<StudentGroup> steam, Integer steamNumber){
        this.steam = steam;
        this.steamNumber = steamNumber;
    }



    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public Integer getSteamNumber() {
        return steamNumber;
    }

    public void setSteamNumber(Integer steamNumber) {
        this.steamNumber = steamNumber;
    }

    /* Переопределяем toString*/
    @Override
    public String toString() {
        return "StudentSteam{" +
                "steam=" + steam +
                ", steamNumber=" + steamNumber +
               '}';
    }
    /* Имплементируем итератор*/
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(steam); // не могу понять почему выделяет красным

    }

//     @Override
//     public Iterator<StudentGroup> iterator() {
//        return new Iterator<StudentGroup>() {
//
//         private int counter;
//
//         @Override
//         public boolean hasNext() {
//
//             if(counter<steam.size())
//             {
//                 return true;
//             }
//             else
//             {
//                 return false;
//             }
//         }
//
//         @Override
//         public StudentGroup next() {
//             return steam.get(counter++);
//         }

//        };
//
//     }

}

    