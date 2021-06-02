package com.webtech.what2cook.persistence;

import javax.persistence.*;
import java.io.*;
import java.net.URLConnection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

import java.net.URL;
import java.nio.charset.Charset;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



@Entity(name = "Rezept")
@Table(name = "rezept")
<<<<<<< HEAD

=======
>>>>>>> a1339df5bc071de56a59bc1617ed468384ea2bb6
public class Rezept {
    @Id
    @SequenceGenerator(
            name = "rezept_sequence",
            sequenceName = "rezept_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =  SEQUENCE,
            generator = "rezept_sequence"
    )

    @Column( name = "id",
            updatable = false
    )
    private Long id;

    @Column ( name = "strMeal",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String strMeal;

    @Column ( name = "drinkAlternate",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String drinkAlternate;

    @Column ( name = "category",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String category;

    @Column ( name = "area",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String area;

    @Column ( name = "instruction",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String instruction;

    private String mealThumb; //Bild

    private String tags;
    private String youTubeLink;

    @Column ( name = "ingre1",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String ingre1;
    private String ingre2;
    private String ingre3;
    private String ingre4;
    private String ingre5;
    private String ingre6;
    private String ingre7;
    private String ingre8;
    private String ingre9;
    private String ingre10;
    private String ingre11;
    private String ingre12;
    private String ingre13;
    private String ingre14;
    private String ingre15;
    private String ingre16;
    private String ingre17;
    private String ingre18;
    private String ingre19;
    private String ingre20;
    private String measure1;
    private String measure2;
    private String measure3;
    private String measure4;
    private String measure5;
    private String measure6;
    private String measure7;
    private String measure8;
    private String measure9;
    private String measure10;
    private String measure11;
    private String measure12;
    private String measure13;
    private String measure14;
    private String measure15;
    private String measure16;
    private String measure17;
    private String measure18;
    private String measure19;
    private String measure20;
    private String source;
    private String imageSource;
    private String creativeCommonsConfirmed;
    private LocalDate dateModified;


//ArrayListen erstellen anstatt feste Anzahl an Zutaten, zwecks flexibilität
    //@ElementCollection ???
   // private ArrayList<String> ingredients;
    //@ElementCollection  ???
    //private ArrayList<String> measure;

//   public List<String> ingredients = new ArrayList<String>();
//    List<String> measure = new ArrayList<String>();


//    public Rezept(String strMeal, ArrayList<String> ingredients, ArrayList<String> measure){
//        this.strMeal = strMeal;
//        this.ingredients = ingredients;
//        this.measure = measure;
//
//        for (String ingr : ingredients){
//            ingredients.add(ingr);
//        }
//
//        for (String mea : measure){
//            measure.add(mea);
//        }
//    }


    //public void Jdata(){
//    public static void main(String[] args){
//        String inputLine = "";
//        JSONParser parser = new JSONParser(inputLine);
//
//        try {
//            URL oracle = new URL("https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata"); // URL to Parse
//            URLConnection yc = oracle.openConnection();
//            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
//
//
//            while ((inputLine = in.readLine()) != null) {
//                JSONArray a = (JSONArray) parser.parse();
//
//
//
//                // Loop through each item
//                for (int i = 0; i < a.length();i++) {
//                    JSONObject tutorials = (JSONObject) a.get(i);
//
//                    String id = (String) tutorials.get("meals");
//
//                    System.out.println("strMal ID : " + id);
//
//                    System.out.println("\n");
//                }
//            }
//            in.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//}
//// bis hier





    public Rezept() {

    }

    public Rezept(String strMeal){
        this.strMeal = strMeal;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getDrinkAlternate() {
        return drinkAlternate;
    }

    public void setDrinkAlternate(String drinkAlternate) {
        this.drinkAlternate = drinkAlternate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getMealThumb() {
        return mealThumb;
    }

    public void setMealThumb(String mealThumb) {
        this.mealThumb = mealThumb;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getYouTubeLink() {
        return youTubeLink;
    }

    public void setYouTubeLink(String youTubeLink) {
        this.youTubeLink = youTubeLink;
    }

    public String getIngre1() {
        return ingre1;
    }

    public void setIngre1(String ingre1) {
        this.ingre1 = ingre1;
    }

    public String getIngre2() {
        return ingre2;
    }

    public void setIngre2(String ingre2) {
        this.ingre2 = ingre2;
    }

    public String getIngre3() {
        return ingre3;
    }

    public void setIngre3(String ingre3) {
        this.ingre3 = ingre3;
    }

    public String getIngre4() {
        return ingre4;
    }

    public void setIngre4(String ingre4) {
        this.ingre4 = ingre4;
    }

    public String getIngre5() {
        return ingre5;
    }

    public void setIngre5(String ingre5) {
        this.ingre5 = ingre5;
    }

    public String getIngre6() {
        return ingre6;
    }

    public void setIngre6(String ingre6) {
        this.ingre6 = ingre6;
    }

    public String getIngre7() {
        return ingre7;
    }

    public void setIngre7(String ingre7) {
        this.ingre7 = ingre7;
    }

    public String getIngre8() {
        return ingre8;
    }

    public void setIngre8(String ingre8) {
        this.ingre8 = ingre8;
    }

    public String getIngre9() {
        return ingre9;
    }

    public void setIngre9(String ingre9) {
        this.ingre9 = ingre9;
    }

    public String getIngre10() {
        return ingre10;
    }

    public void setIngre10(String ingre10) {
        this.ingre10 = ingre10;
    }

    public String getIngre11() {
        return ingre11;
    }

    public void setIngre11(String ingre11) {
        this.ingre11 = ingre11;
    }

    public String getIngre12() {
        return ingre12;
    }

    public void setIngre12(String ingre12) {
        this.ingre12 = ingre12;
    }

    public String getIngre13() {
        return ingre13;
    }

    public void setIngre13(String ingre13) {
        this.ingre13 = ingre13;
    }

    public String getIngre14() {
        return ingre14;
    }

    public void setIngre14(String ingre14) {
        this.ingre14 = ingre14;
    }

    public String getIngre15() {
        return ingre15;
    }

    public void setIngre15(String ingre15) {
        this.ingre15 = ingre15;
    }

    public String getIngre16() {
        return ingre16;
    }

    public void setIngre16(String ingre16) {
        this.ingre16 = ingre16;
    }

    public String getIngre17() {
        return ingre17;
    }

    public void setIngre17(String ingre17) {
        this.ingre17 = ingre17;
    }

    public String getIngre18() {
        return ingre18;
    }

    public void setIngre18(String ingre18) {
        this.ingre18 = ingre18;
    }

    public String getIngre19() {
        return ingre19;
    }

    public void setIngre19(String ingre19) {
        this.ingre19 = ingre19;
    }

    public String getIngre20() {
        return ingre20;
    }

    public void setIngre20(String ingre20) {
        this.ingre20 = ingre20;
    }

    public String getMeasure1() {
        return measure1;
    }

    public void setMeasure1(String measure1) {
        this.measure1 = measure1;
    }

    public String getMeasure2() {
        return measure2;
    }

    public void setMeasure2(String measure2) {
        this.measure2 = measure2;
    }

    public String getMeasure3() {
        return measure3;
    }

    public void setMeasure3(String measure3) {
        this.measure3 = measure3;
    }

    public String getMeasure4() {
        return measure4;
    }

    public void setMeasure4(String measure4) {
        this.measure4 = measure4;
    }

    public String getMeasure5() {
        return measure5;
    }

    public void setMeasure5(String measure5) {
        this.measure5 = measure5;
    }

    public String getMeasure6() {
        return measure6;
    }

    public void setMeasure6(String measure6) {
        this.measure6 = measure6;
    }

    public String getMeasure7() {
        return measure7;
    }

    public void setMeasure7(String measure7) {
        this.measure7 = measure7;
    }

    public String getMeasure8() {
        return measure8;
    }

    public void setMeasure8(String measure8) {
        this.measure8 = measure8;
    }

    public String getMeasure9() {
        return measure9;
    }

    public void setMeasure9(String measure9) {
        this.measure9 = measure9;
    }

    public String getMeasure10() {
        return measure10;
    }

    public void setMeasure10(String measure10) {
        this.measure10 = measure10;
    }

    public String getMeasure11() {
        return measure11;
    }

    public void setMeasure11(String measure11) {
        this.measure11 = measure11;
    }

    public String getMeasure12() {
        return measure12;
    }

    public void setMeasure12(String measure12) {
        this.measure12 = measure12;
    }

    public String getMeasure13() {
        return measure13;
    }

    public void setMeasure13(String measure13) {
        this.measure13 = measure13;
    }

    public String getMeasure14() {
        return measure14;
    }

    public void setMeasure14(String measure14) {
        this.measure14 = measure14;
    }

    public String getMeasure15() {
        return measure15;
    }

    public void setMeasure15(String measure15) {
        this.measure15 = measure15;
    }

    public String getMeasure16() {
        return measure16;
    }

    public void setMeasure16(String measure16) {
        this.measure16 = measure16;
    }

    public String getMeasure17() {
        return measure17;
    }

    public void setMeasure17(String measure17) {
        this.measure17 = measure17;
    }

    public String getMeasure18() {
        return measure18;
    }

    public void setMeasure18(String measure18) {
        this.measure18 = measure18;
    }

    public String getMeasure19() {
        return measure19;
    }

    public void setMeasure19(String measure19) {
        this.measure19 = measure19;
    }

    public String getMeasure20() {
        return measure20;
    }

    public void setMeasure20(String measure20) {
        this.measure20 = measure20;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public String getCreativeCommonsConfirmed() {
        return creativeCommonsConfirmed;
    }

    public void setCreativeCommonsConfirmed(String creativeCommonsConfirmed) {
        this.creativeCommonsConfirmed = creativeCommonsConfirmed;
    }

    public LocalDate getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }
}


