package oopRep;

import org.junit.Test;  //подключение библиотеки  Test, котора¤ будет импортировать @Test аннотации дл¤ Junits
import junit.framework.Assert; //подключение библиотеки Assert, котора¤ содержит набор методов assert
import static org.junit.Assert.*; //подключение библиотеки Assert, котора¤  служит дл¤ проверки тестовой логики
public class test { // описание публичного класса test1
@Test // объ¤вление теста с помощью маркировки тестового метода аннотацией @Test
public void test1() { //описание публичного метода test1()
	double res = depcalc.calculate(12, 100000, 12) ; //объ¤вление переменной res с последующей передачей ей значени¤, полученного в методе calculate. ћетоду передаютс¤ значени¤: сумма первоначального взноса, ставка, срок вклада
	if(res!=112000)Assert.fail(); //проверка на соответствие результату
}; // заканчиваетс¤ объ¤вление метода   test1()
}// завершаетс¤ объ¤вление класса test1
