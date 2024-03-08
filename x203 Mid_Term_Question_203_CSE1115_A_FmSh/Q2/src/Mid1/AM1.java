package Mid1;

public class AM1 {
    int i;
  public AM1(int i)
   {
       this.i=i;
   }
}
//Answer 1:It made public because if it were default private, class AM1 couldnt have accessed this class. Because we know In default
// private we cant access from outside.If we remove public keyword it will not work
//Answer 2: It made public so that it can be accessed outside package. if we remove public it will not work .
//Answer 3: "i" variable in AM1 class will not be accesseble to AM2 class. it can be accesseble by two ways
//number 1 is by using getter setter method, number 2 is we have to complete AM1 parameterless method and use super method in AM2 class
