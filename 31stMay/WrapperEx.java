public class WrapperEx {
    public static void main(String[]args){
        byte b = 4;
        int i = 45;
        float f = 67.4f;
        double d = 345.65d;
        boolean bo = true;
        String s = "Hi";

        Byte bobj = b;
        Integer iobj = i;
        Float fobj = f;
        Double dobj = d;
        Boolean boobj = bo;
        String sobj = s;

        byte bvalue = bobj;
        int ivalue = iobj;
        float fvalue = fobj;

        System.out.println("The objects of Primitive Datatypes are: " + bobj + " ," + iobj +" ,"+ fobj +" ,"+ dobj + " ," + boobj + " ," + sobj);
        System.out.println("The Primitive Datatypes are: " + bvalue + " ," + ivalue +" ,"+ fvalue);
    }
}