package com.example.kitchenstories.Model.recipe;

import java.util.ArrayList;
import java.util.Map;

public class Recipe {


    private String name_cooking_recipe;
    private String url_image_CookingRecipe;

    private String name_author;
    private String name_authorGroup;
    private String contact_author;
    private String author_description;
    private String url_image_author;

    private Long likeAmount;
    private Long ratingAmount;
    private Long preparationTimeSort;
    private Long caloriesSort;

    private String difficulty_Level_Recipe;
    private ArrayList<String> periodCooking;
    private ArrayList<String> ingredients;
    private ArrayList<String> amountOfIngredients;
    private String utensils;
    private ArrayList<String> nutritionPerServing;
    private Map<String, Boolean> tags;
    private ArrayList<String> tagsSort;



    public Recipe() {
    }

    public Recipe(String name_cooking_recipe, String url_image_CookingRecipe) {
        this.name_cooking_recipe = name_cooking_recipe;
        this.url_image_CookingRecipe = url_image_CookingRecipe;
    }

    // doing Firebase
    public Recipe(String name_cooking_recipe,
                  String url_image_CookingRecipe,
                  String name_author,
                  String name_authorGroup,
                  String contact_author,
                  String author_description,
                  String url_image_author,
                  Long likeAmount,
                  Long ratingAmount,
                  Long preparationTimeSort,
                  Long caloriesSort,
                  String difficulty_Level_Recipe,
                  ArrayList<String> periodCooking,
                  ArrayList<String> ingredients,
                  ArrayList<String> amountOfIngredients,
                  String utensils,
                  ArrayList<String> nutritionPerServing,
                  Map<String, Boolean> tags,
                  ArrayList<String> tagsSort) {
        this.name_cooking_recipe = name_cooking_recipe;
        this.url_image_CookingRecipe = url_image_CookingRecipe;
        this.name_author = name_author;
        this.name_authorGroup = name_authorGroup;
        this.contact_author = contact_author;
        this.author_description = author_description;
        this.url_image_author = url_image_author;
        this.likeAmount = likeAmount;
        this.ratingAmount = ratingAmount;
        this.preparationTimeSort = preparationTimeSort;
        this.caloriesSort = caloriesSort;
        this.difficulty_Level_Recipe = difficulty_Level_Recipe;
        this.periodCooking = periodCooking;
        this.ingredients = ingredients;
        this.amountOfIngredients = amountOfIngredients;
        this.utensils = utensils;
        this.nutritionPerServing = nutritionPerServing;
        this.tags = tags;
        this.tagsSort = tagsSort;
    }


    // add recipe to USER
    public Recipe(String name_cooking_recipe,
                  String url_image_CookingRecipe,
                  String name_author,
                  String name_authorGroup,
                  String url_image_author,
                  Long likeAmount,
                  ArrayList<String> periodCooking) {
        this.name_cooking_recipe = name_cooking_recipe;
        this.url_image_CookingRecipe = url_image_CookingRecipe;
        this.name_author = name_author;
        this.name_authorGroup = name_authorGroup;
        this.url_image_author = url_image_author;
        this.likeAmount = likeAmount;
        this.periodCooking = periodCooking;
    }


    public String getName_cooking_recipe() {
        return name_cooking_recipe;
    }

    public void setName_cooking_recipe(String name_cooking_recipe) {
        this.name_cooking_recipe = name_cooking_recipe;
    }

    public String getUrl_image_CookingRecipe() {
        return url_image_CookingRecipe;
    }

    public void setUrl_image_CookingRecipe(String url_image_CookingRecipe) {
        this.url_image_CookingRecipe = url_image_CookingRecipe;
    }

    public String getName_author() {
        return name_author;
    }

    public void setName_author(String name_author) {
        this.name_author = name_author;
    }

    public String getName_authorGroup() {
        return name_authorGroup;
    }

    public void setName_authorGroup(String name_authorGroup) {
        this.name_authorGroup = name_authorGroup;
    }

    public String getDifficulty_Level_Recipe() {
        return difficulty_Level_Recipe;
    }

    public void setDifficulty_Level_Recipe(String difficulty_Level_Recipe) {
        this.difficulty_Level_Recipe = difficulty_Level_Recipe;
    }



    public String getUtensils() {
        return utensils;
    }

    public void setUtensils(String utensils) {
        this.utensils = utensils;
    }

    public ArrayList<String> getPeriodCooking() {
        return periodCooking;
    }

    public void setPeriodCooking(ArrayList<String> periodCooking) {
        this.periodCooking = periodCooking;
    }

    public ArrayList<String> getNutritionPerServing() {
        return nutritionPerServing;
    }

    public void setNutritionPerServing(ArrayList<String> nutritionPerServing) {
        this.nutritionPerServing = nutritionPerServing;
    }

    public Map<String, Boolean> getTags() {
        return tags;
    }

    public void setTags(Map<String, Boolean> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getAmountOfIngredients() {
        return amountOfIngredients;
    }

    public void setAmountOfIngredients(ArrayList<String> amountOfIngredients) {
        this.amountOfIngredients = amountOfIngredients;
    }

    public String getContact_author() {
        return contact_author;
    }

    public void setContact_author(String contact_author) {
        this.contact_author = contact_author;
    }

    public String getAuthor_description() {
        return author_description;
    }

    public void setAuthor_description(String author_description) {
        this.author_description = author_description;
    }

    public String getUrl_image_author() {
        return url_image_author;
    }

    public void setUrl_image_author(String url_image_author) {
        this.url_image_author = url_image_author;
    }

    public Long getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(Long likeAmount) {
        this.likeAmount = likeAmount;
    }

    public Long getRatingAmount() {
        return ratingAmount;
    }

    public void setRatingAmount(Long ratingAmount) {
        this.ratingAmount = ratingAmount;
    }

    public ArrayList<String> getTagsSort() {
        return tagsSort;
    }

    public void setTagsSort(ArrayList<String> tagsSort) {
        this.tagsSort = tagsSort;
    }

    public Long getPreparationTimeSort() {
        return preparationTimeSort;
    }

    public void setPreparationTimeSort(Long preparationTimeSort) {
        this.preparationTimeSort = preparationTimeSort;
    }

    public Long getCaloriesSort() {
        return caloriesSort;
    }

    public void setCaloriesSort(Long caloriesSort) {
        this.caloriesSort = caloriesSort;
    }
}

