class JoinDemo extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
    public static void main(String args[]){
        JoinDemo t1=new JoinDemo();
        JoinDemo t2=new JoinDemo();
        JoinDemo t3=new JoinDemo();
        t1.start();
        t2.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}


        t3.start();
    }
}
