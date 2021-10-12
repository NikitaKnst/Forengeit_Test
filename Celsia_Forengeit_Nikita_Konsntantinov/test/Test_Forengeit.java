
import CelClass.CelsiusClass;
import org.junit.After; 
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class Test_Forengeit {
    //private Calculator obj;
    //@BeforeClass
 public Test_Forengeit() {
     //public void RunT(){
       //  obj=new Calculator
         
     
 }
  //Тут мы проверяем обратное из Цельсию в форенгейт
 @Test
 public void Test_Forengeit(){ 
 //создаем объект класса
 CelsiusClass obj=new CelsiusClass();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double celsius1=obj.celsiusFarengeit(72,(9.0 / 5.0) + 32);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(celsius1, 161.6, 0.0001);
 }
  @Test
 public void Test_Forengeit2(){ 
 //создаем объект класса
 CelsiusClass obj=new CelsiusClass();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double celsius1=obj.celsiusFarengeit(115,(9.0 / 5.0) + 32);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(celsius1, 239.0, 0.0001);
 }
  @Test
 public void Test_Forengeit3(){ 
 //создаем объект класса
 CelsiusClass obj=new CelsiusClass();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double celsius1=obj.celsiusFarengeit(355,(9.0 / 5.0) + 32);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(celsius1, 671.0, 0.0001);
 }
   @Test
  public void Test_Forengeit4(){ 
 //создаем объект класса
 CelsiusClass obj=new CelsiusClass();
//вызываем метод класса liitmine() с конкретными //параметрами
 double celsius1=obj.celsiusFarengeit(500,(9.0 / 5.0) + 32);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(celsius1, 932.0, 0.0001);
 }
  ////////////////////////////////////////////////////////////////////////////////////////
 //Тут мы проверяем обратное из Форенгейт в цельсию
 @Test
 public void Test_FORENGEITinCelsius(){
  CelsiusClass obj=new CelsiusClass();
//вызываем метод класса liitmine() с конкретными //параметрами
 double forengeit1=obj.ForengeitCelsius(72,(5.0 / 9.0));
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(forengeit1, 22.222221, 0.0001);
 }
  @Test
public void Test_FORENGEITinCelsius2(){
  CelsiusClass obj=new CelsiusClass();
//вызываем метод класса liitmine() с конкретными //параметрами
 double forengeit1=obj.ForengeitCelsius(255,(5.0 / 9.0));
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(forengeit1, 123.888885, 0.0001);
 }
  @Test
public void Test_FORENGEITinCelsius3(){
  CelsiusClass obj=new CelsiusClass();
//вызываем метод класса liitmine() с конкретными //параметрами
 double forengeit1=obj.ForengeitCelsius(500,(5.0 / 9.0));
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(forengeit1, 260.0, 0.0001);
 }
  @Test
public void Test_FORENGEITinCelsius4(){
  CelsiusClass obj=new CelsiusClass();
//вызываем метод класса liitmine() с конкретными //параметрами
 double forengeit1=obj.ForengeitCelsius(1000,(5.0 / 9.0));
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(forengeit1, 537.7778, 0.0001);
 }
}
 
//}