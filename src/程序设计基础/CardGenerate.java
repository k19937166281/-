package ������ƻ���;

public class CardGenerate {
    private static String bin = "";

    //����һ��ʮ�������� ������ ���  bin ��ת����������
    private static void getCount(int n){
        //ȥ�������Ķ���֮n
        int n_2 = n/2;
        //����
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
        //�õ��Ķ����� һ���� ��λΪ 1��  ��Ϊ  1/2 = 0 �� 1�� 2/2 = 1 �� 0 �� 3/2 = 1 �� 1��
        //һ�� ʮ������  һֱ����2  һ���õ�  0��1    ������ ��������ż��  ��ͨ������ 5��4 �õ����
        //System.out.println(new StringBuilder(bin).reverse().toString());
        //System.out.println("��NΪ"+N+"ʱ����Ҫ�Ŀ�Ƭ����Ϊ"+bin.length());
    }

    /////////////////////////////
    ///////////////////////////////
}
