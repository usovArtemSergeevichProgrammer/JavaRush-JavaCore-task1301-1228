package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            File file = new File(bufferedReader.readLine());
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while (true){
                line = bufferedReader.readLine();
                bufferedWriter.write(line+"\n");
                if(line.equals("exit")){
                    break;
                }
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
