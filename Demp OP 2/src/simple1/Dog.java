package simple1;


   public class Dog extends animal
    {
      int age;
        public Dog(String name, String colour, String owner,int age) {
            super(name, colour, owner);
            this.age=age;
        }


        @Override
        void print() {
            super.print();
            System.out.print(" "+age+"\n");
        }
    }

