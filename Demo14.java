void main(){
    final String[][] customer={{"1","2","3","4"},{"Kasun","Nuwan","Ruwan","Supun"},
            {"071-2342342","0776532761","0786657678","0777543765"},{"0112-398231"," - ",null,"0112-345656"}};
    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-"
            .repeat(12)}+\{"-".repeat(12)}+";
    final String HEADER = "\033[46;1m|%-5s|%-8s|%-12s|%12s|\033[0m"
            .formatted("ID", "NAME", "CONTACT1", "CONTACT2");
    final String ROW = "|%-5s|%-8s|%-12s|%12s|\n";
    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);
//    int i =0;
//    for(String[] newCustomer:customer){
//        String id =  newCustomer[0];
//        String name = newCustomer[1];
//        String cont1 = newCustomer [2];
//        String cont2 =  newCustomer [3];
//
//        System.out.printf(ROW, getId(id), getName(name),
 //              getCon1(cont1), getCon2(cont2));
    for (int i = 0; i < customer.length; i++) {
        String id =  customer[0][i];
       String name = customer[1][i];
       String cont1 = customer [2][i];
        String cont2 =  customer [3][i];

        System.out.printf(ROW, getId(id), getName(name), getCon1(cont1), getCon2(cont2));
    }

    }

String getId(String id){
    return "C%03d".formatted(Integer.parseInt(id));
}

String getName(String name){return name;}

String getCon1(String cont1){return cont1;}

String getCon2(String cont2){return cont2==null ? " - ":cont2;}

