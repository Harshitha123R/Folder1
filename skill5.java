public class skill5{
    public static void main(System[]args){
        int[][]a={{1,2},{3,4}};
        int[][]b={{5,6},{7,8}};
        int[][]sum=new int[2][2];

        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(sum[i][j]);
            }
        }

    }
}

// public class skill5{
//     public static void main(System[]args){
//         int[][]a={{1,2},{3,4}};
//         int[][]b={{5,6},{7,8}};
//         int[][]product=new int[2][2];

//         for(int i =0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 product[i][j] =0;
//                 for(int k=0;k<2;k++){
//                     product[i][j] +=a[i][k]*b[k][j];
//                 }
//             }
//         }
//         for(int i =0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 System.out.println(product[i][j]);
//             }
//         }

