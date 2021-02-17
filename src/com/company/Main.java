package com.company;

public class Main {

    public static void main(String[] args) {
        String[] myResult = new String[2];
        String phoneNumber = " +7 (921) 221 37 46 ";
        String phoneChanges = "";
        phoneNumber = phoneNumber.strip();
        boolean isNotChanged = true;
        if (phoneNumber.startsWith("+7")){
            phoneNumber = phoneNumber.substring(1);
            phoneNumber = phoneNumber.replaceFirst("7","8");
            phoneChanges = phoneChanges.concat("Замена +7 на 8; ");
            isNotChanged = false;
        }
        if (phoneNumber.contains(" ") || phoneNumber.contains("(") || phoneNumber.contains(")")){
            phoneNumber = phoneNumber.replaceAll("\\D", "");
            phoneChanges = phoneChanges.concat("В номере есть пробелы и/или скобки; ");
            isNotChanged = false;
        }
        if (phoneNumber.length() != 11){
            phoneNumber = "Введен некорректный номер";
            phoneChanges = phoneChanges.concat("Количество символов не равно 11");
            isNotChanged = false;
        }
        if (isNotChanged) {
            phoneChanges = "Не было изменений";
        }
        myResult[0] = phoneNumber;
        myResult[1] = phoneChanges;
        for (int i = 0; i < myResult.length; i++) {
            System.out.print(myResult[i] + "\n");
        }
    }
}
