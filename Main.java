import org.w3c.dom.Node;

import java.util.LinkedList;

/*
Реализовать свой LinkedList с методами вставки в начало, конец списка,
получения размера списка и получения элемента по индексу.
(можете выбрать список однонаправленный или двунаправленный, по желанию)
Дополнительные материалы:
Ссылка на статью о дженериках
https://www-baeldung-com.translate.goog/java-generics?_x_tr_sl=en&_x_tr_tl=ru&_x_tr_hl=ru&_x_tr_pto=sc
ссылка на статью о LinkedList
https://habr.com/ru/post/337558/
ссылка на ролик по LinkedList
https://www.youtube.com/watch?v=BH6RJf2fVCQ
линкед лист на английском: https://www.youtube.com/watch?v=ZlNKNSz88Nk&t=483s&ab_channel=BlueTreeCode
Формат сдачи: ссылка на гит

 */
public class Main {

    public static void main(String[] args) {

        LinkedList<String> stringLinked = new LinkedList<>();
        stringLinked.addFirst("a");
        stringLinked.addLast("b");
        System.out.println("Начальный LinkedList " + stringLinked);
        stringLinked.addFirst("z");
        System.out.println("LinkedList после добавления элемента вначало " + stringLinked);
        System.out.println("Размер LinkedList: " + stringLinked.size());
        //System.out.println(stringLinked.getElementByIndex(2));




    }

}
