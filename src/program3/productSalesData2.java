package program3;

/**
 * Name: Griffin Greer
 * Student ID: 112674762
 * Course & Section: CIS331 Section 2
 * 
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 */

import java.util.*;
import java.io.*;
import java.text.NumberFormat;

public class productSalesData2 {

    public static void main(String[] args) {
       
        try {
            int totalProducts = 0;

            String[] prodNames = new String[100];

            int[] totalUnits = new int[100];

            double[] totalRev = new double[100];

            String[] regions = {"North", "South", "East", "West"};

            double[] regionsRev = new double[100];

            Scanner input = new Scanner(System.in);

            System.out.println("Enter full path of input file: ");

            File newFile = new File(input.nextLine());

            Scanner file = new Scanner(newFile);

            while (file.hasNextLine()) {

                String line = file.nextLine();

                StringTokenizer str = new StringTokenizer(line);

                while (str.hasMoreTokens()) {
                    prodNames[totalProducts] = str.nextToken();

                    double price = Double.parseDouble(str.nextToken());

                    int units = 0;

                    int counter = 0;

                    while (str.hasMoreTokens()) {
                        String token = str.nextToken();

                        regionsRev[counter] += Double.parseDouble(token) * price;

                        units = units + Integer.parseInt(token);

                        counter++;
                        
                    }

                        totalUnits[totalProducts] = units;

                        totalRev[totalProducts] = units * price;

                        totalProducts++;
                }
            }

                        NumberFormat formatter = NumberFormat.getCurrencyInstance();

                        double totalRegionRev = 0;

                        int allUnits = 0;

                        System.out.println("\n\nRevenue by Region:");
                        for (int i = 0; i < regions.length; i++) {
                            totalRegionRev += regionsRev[i];
                            System.out.println(regions[i] + "\t" + formatter.format(regionsRev[i]));
                        }

                            System.out.println("Total Revenue:\t" + formatter.format(totalRegionRev));

                            double averageRevenue = totalRegionRev / totalProducts;

                            System.out.println("\n\nProduct Summary\nProduct Type\tUnits\tRevenue");
                            for (int i = 0; i < prodNames.length; i++) {
                                if (prodNames[i] != null) {
                                    allUnits += totalUnits[i];
                                    System.out.println(prodNames[i] + "\t" + totalUnits[i] + "\t" + formatter.format(totalRev[i]));

                                }
                            }

                            System.out.println("GRAND TOTAL:\t" + allUnits + "\t" + formatter.format(totalRegionRev) + "\nAVERAGE REVENUE:\t" + formatter.format(averageRevenue));

                            String topPerformers = "";

                            for (int i = 0; i < totalRev.length; i++) {
                                if (totalRev[i] != 0 && totalRev[i] > averageRevenue) {
                                    topPerformers += "\n\t" + prodNames[i];
                                }

                            }

                            if (!topPerformers.equals(null)) {
                                System.out.println("\n\nThe following products generated higher than the average revenue" + topPerformers);

                            }
                            input.close();
                            file.close();

        }
            catch (Exception e) {
                System.out.println("There is an error reading the file: " + e.toString());
                

        }

                    }

                }
