package 程序设计基础;

public class CardGenerate {
    private static String bin = "";

    //计算一个十进制数的 二进制 表达  bin 反转过来就是了
    private static void getCount(int n){
        //去掉余数的二分之n
        int n_2 = n/2;
        //余数
        int yushu= n-n_2-n_2;
        bin+=""+yushu;
        if (n_2!=0){
            getCount(n_2);
        }else {
            System.out.println(new StringBuilder(bin).reverse().toString());
            bin="";
        }
    }
    public static void main(String[] args) {

        int N = 50;
        for (int i = 1; i <= N; i++) {
            getCount(i);
        }
        //得到的二进制 一定是 首位为 1的  因为  1/2 = 0 余 1； 2/2 = 1 余 0 ； 3/2 = 1 余 1；
        //一个 十进制数  一直除以2  一定得到  0余1    无论是 奇数还是偶数  ，通过测试 5和4 得到结果
        //System.out.println(new StringBuilder(bin).reverse().toString());
        //System.out.println("当N为"+N+"时：需要的卡片数量为"+bin.length());
    }

    /////////////////////////////
    ///////////////////////////////
}
