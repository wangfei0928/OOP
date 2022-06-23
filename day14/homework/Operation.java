package com.lanou.day14.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Operation {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\文件\\IO1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Worker worker1 = new Worker("小王", 19, 120.0);
        Worker worker2 = new Worker("小刘", 22, 11.2);

        oos.writeObject(worker1);
        oos.writeObject(worker2);

        FileInputStream fis = new FileInputStream("D:\\文件\\IO1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        Object o1 = ois.readObject();
        Worker worker3 = (Worker) o;
        Worker worker4 = (Worker) o1;

        System.out.println(worker3);
        System.out.println(worker4);

        // 调用方法一
        File file = new File("D:\\文件\\test.txt");
        saveWorkerToFile(worker1, file);
        saveWorkerToFile(worker2, file);

        // 调用方法二
        List<Worker> list = readWorkerFromFile(file);
        for (Worker worker : list) {
            System.out.println(worker);
        }
    }
        public static void saveWorkerToFile(Worker w, File file) throws IOException {
            FileWriter fw = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fw);
            writer.println(w.getName() + "/" + w.getAge() + "/" + w.getSalary());
            writer.flush();
            writer.close();
        }

        public static List<Worker> readWorkerFromFile(File file) throws IOException {
            List<Worker> list = new ArrayList<>();
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String len;
            while ((len = bufferedReader.readLine()) != null) {
                String[] strings = len.split("/");
                Worker worker = new Worker(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]));
                list.add(worker);
            }

            return list;
        }

}
