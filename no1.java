import java.sql.SQLOutput;
import java.util.Scanner;

/*import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if (no > 10) {
            System.out.println("zz");
        }
    }
}*/
//psvm用来写主函数
/*标准输入格式：
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
 */
/*
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no2= sc.nextInt();
        if(no2%2==0)
        {
            System.out.println("坐右边");
        }
        else {
            System.out.println("坐左边");
        }
    }
}
 */
/*
import java.util.Scanner;

//switch语句
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no3= sc.nextInt();
        switch (no3)
        {
            case 1:
                //冒号而不是分号
                System.out.println("星期一");
                break;
            case 2:
                //冒号而不是分号
                System.out.println("星期二");
                break;
            case 3:
                //冒号而不是分号
                System.out.println("星期三");
                break;
            case 4:
                //冒号而不是分号
                System.out.println("星期四");
                break;
            case 5:
                //冒号而不是分号
                System.out.println("星期五");
                break;
            default:
                System.out.println("周末");
        }
    }
}
//冒号问题+break+default
 */
/*
//switch新特性
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no4= sc.nextInt();
        switch (no4){
            case 1->{
                System.out.println("周一");
            }
            case 2->{
                System.out.println("周二");
            }
            case 3->{
                System.out.println("周三");
            }
            default -> {
                System.out.println("快要放假了");
            }
        }
    }
}
//用->代替了：和break
//只有一句话时{}也可省略
 */
/*
public class no1 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int b= sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%3==0&&i%5==0)
                count++;
        }
        System.out.println(count);
    }
}
//Scanner 的变量名不能重复
 */
/*
public class no1 {
    public static void main(String[] args) {
        int i=100;
        while (i>0)
        {
            System.out.println(i);
            i--;
        }
    }
}
 */
/*
//回文写法，很好
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int record=i;
        int num=0;
        int j;
        while(i!=0)
        {
            j=i%10;//最后一位
            i=i/10;//前几位
            num=num*10+j;
        }
        if(record==num)
            System.out.println("ez");
        else
            System.out.println("gg");
    }
}
 */
//不用乘除与%的情况下实现整除
/*
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        Scanner sc2=new Scanner(System.in);
        int b= sc.nextInt();
        int count=0;
        while(a>=b)
        {
           a=a-b;
           count++;
        }
        System.out.println(count);
        System.out.println(a);
    }
}
 */
/*
//continue用来结束本次循环
public class no1 {
    public static void main(String[] args) {
        int i=0;
        for(int j=0;j<3;j++)
            for (int m=0;m<3;m++)
            {
                //j:0 m:0
                //j:0 m:1
                //j:0 m:2
                //j:1 m:0
                //j:1 m:1
                //j:1 m:2
                //j:2 m:0
                //j:2 m:1
                //j:2 m:2
                //若一层，则为16
                //若两层，则为13
                if(m==1&&j==1)
                    continue;
                i=i+j+m;
            }
        System.out.println(i);
    }
}
//continue只退出一个循环
//break退出所有程序
//逢7过
/*
public class no1 {
    public static void main(String[] args) {
        for(int i=1;i<101;i++)
        {
            if(i%7==0)
            {
                System.out.println(i);
                continue;
            }
            else {
                int j=0;
                int m=i;
                while (m>=j)
                {
                    j=m%10;
                    m=m/10;
                    if(j==7) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
 */