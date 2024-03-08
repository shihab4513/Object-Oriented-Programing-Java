class AQ {


        public double v1;
        int a1;
        public AQ(double v1,int a1)
        {
            this.v1=v1;
            this.a1=a1;
        }
        public void AQ(int p)
        {
            this.AQ(100);
        }
        void f1(int a,int b)
        {
            System.out.println(a+b+v1+a1);
        }
        void  f1(int x)
        {
            System.out.println(v1+a1+x);
        }


}
