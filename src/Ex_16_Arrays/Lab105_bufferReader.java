package Ex_16_Arrays;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Lab105_bufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value");
        int N=Integer.parseInt(bf.readLine().trim());
        System.out.println(N);
    }
}
