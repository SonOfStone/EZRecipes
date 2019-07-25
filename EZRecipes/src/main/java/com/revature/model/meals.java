package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="meals", schema="ezrecipes")
public class meals {
//	@Id
//	@Column(name ="idMeal")
	private int idMeal;
//	@Column(name = "strMeal")
	private String strMeal;
//	@Column(name = "strDrinkAlternate")
	private String strDrinkAlternate;
//	@Column(name = "strCategory")
	private String strCategory;
//	@Column(name = "strArea")
	private String strArea;
//	@Column (name = "strInstructions")
	private String strInstructions;
//	@Column(name = "strMealThumb")
	private String strMealThumb;
//	@Column(name= "strTags")
	private String strTags;
//	@Column(name="strYoutube")
	private String strYoutube;
//	@Column(name="strIngredient1")
	private String strIngredient1;
//	@Column(name="strIngredient2")
	private String strIngredient2;
//	@Column(name="strIngredient3")
	private String strTingredient3;
//	@Column(name="strIngredient4")
	private String strIngredient4;
//	@Column(name="strIngredient5")
	private String strIngredient5;
//	@Column(name="strIngredient6")
	private String strIngredient6;
//	@Column(name="strIngredient7")
	private String strIngredient7;
//	@Column(name="strIngredient8")
	private String strIngredient8;
//	@Column(name="strIngredient9")
	private String strIngredient9;
//	@Column(name="strIngredient10")
	private String strIngredient10;
//	@Column(name="strIngredient11")
	private String strIngredient11;
//	@Column(name="strIngredient12")
	private String strIngredient12;
//	@Column(name="strIngredient13")
	private String strIngredient13;
//	@Column(name="strIngredient14")
	private String strIngredient14;
//	@Column(name="strIngredient15")
	private String strIngredient15;
//	@Column(name="strIngredient16")
	private String strIngredient16;
//	@Column(name="strIngredient17")
	private String strIngredient17;
//	@Column(name="strIngredient18")
	private String strIngredient18;
//	@Column(name="strIngredient19")
	private String strIngredient19;
//	@Column(name="strIngredient20")
	private String strIngredient20;
//	@Column(name="strMeasure1")
	private String strMeasure1;
//	@Column(name="strMeasure2")
	private String strMeasure2;
//	@Column(name="strMeasure3")
	private String strMeasure3;
//	@Column(name="strMeasure4")
	private String strMeasure4;
//	@Column(name="strMeasure5")
	private String strMeasure5;
//	@Column(name="strMeasure6")
	private String strMeasure6;
//	@Column(name="strMeasure7")
	private String strMeasure7;
//	@Column(name="strMeasure8")
	private String strMeasure8;
//	@Column(name="strMeasure9")
	private String strMeasure9;
//	@Column(name="strMeasure10")
	private String strMeasure10;
//	@Column(name="strMeasure11")
	private String strMeasure11;
//	@Column(name="strMeasure12")
	private String strMeasure12;
//	@Column(name="strMeasure13")
	private String strMeasure13;
//	@Column(name="strMeasure14")
	private String strMeasure14;
//	@Column(name="strMeasure15")
	private String strMeasure15;
//	@Column(name="strMeasure16")
	private String strMeasure16;
//	@Column(name="strMeasure17")
	private String strMeasure17;
//	@Column(name="strMeasure18")
	private String strMeasure18;
//	@Column(name="strMeasure19")
	private String strMeasure19;
//	@Column(name="strMeasure20")
	private String strMeasure20;
//	@Column(name="strSource")
	private String strSource;
//	@Column(name="dateModified")
	private String dateModified;

	public meals(int idMeal, String strMeal, String strDrinkAlternate, String strCategory, String strArea,
			String strInstructions, String strMealThumb, String strTags, String strYoutube, String strIngredient1,
			String strIngredient2, String strTingredient3, String strIngredient4, String strIngredient5,
			String strIngredient6, String strIngredient7, String strIngredient8, String strIngredient9,
			String strIngredient10, String strIngredient11, String strIngredient12, String strIngredient13,
			String strIngredient14, String strIngredient15, String strIngredient16, String strIngredient17,
			String strIngredient18, String strIngredient19, String strIngredient20, String strMeasure1,
			String strMeasure2, String strMeasure3, String strMeasure4, String strMeasure5, String strMeasure6,
			String strMeasure7, String strMeasure8, String strMeasure9, String strMeasure10, String strMeasure11,
			String strMeasure12, String strMeasure13, String strMeasure14, String strMeasure15, String strMeasure16,
			String strMeasure17, String strMeasure18, String strMeasure19, String strMeasure20, String strSource,
			String dateModified) {
		super();
		this.idMeal = idMeal;
		this.strMeal = strMeal;
		this.strDrinkAlternate = strDrinkAlternate;
		this.strCategory = strCategory;
		this.strArea = strArea;
		this.strInstructions = strInstructions;
		this.strMealThumb = strMealThumb;
		this.strTags = strTags;
		this.strYoutube = strYoutube;
		this.strIngredient1 = strIngredient1;
		this.strIngredient2 = strIngredient2;
		this.strTingredient3 = strTingredient3;
		this.strIngredient4 = strIngredient4;
		this.strIngredient5 = strIngredient5;
		this.strIngredient6 = strIngredient6;
		this.strIngredient7 = strIngredient7;
		this.strIngredient8 = strIngredient8;
		this.strIngredient9 = strIngredient9;
		this.strIngredient10 = strIngredient10;
		this.strIngredient11 = strIngredient11;
		this.strIngredient12 = strIngredient12;
		this.strIngredient13 = strIngredient13;
		this.strIngredient14 = strIngredient14;
		this.strIngredient15 = strIngredient15;
		this.strIngredient16 = strIngredient16;
		this.strIngredient17 = strIngredient17;
		this.strIngredient18 = strIngredient18;
		this.strIngredient19 = strIngredient19;
		this.strIngredient20 = strIngredient20;
		this.strMeasure1 = strMeasure1;
		this.strMeasure2 = strMeasure2;
		this.strMeasure3 = strMeasure3;
		this.strMeasure4 = strMeasure4;
		this.strMeasure5 = strMeasure5;
		this.strMeasure6 = strMeasure6;
		this.strMeasure7 = strMeasure7;
		this.strMeasure8 = strMeasure8;
		this.strMeasure9 = strMeasure9;
		this.strMeasure10 = strMeasure10;
		this.strMeasure11 = strMeasure11;
		this.strMeasure12 = strMeasure12;
		this.strMeasure13 = strMeasure13;
		this.strMeasure14 = strMeasure14;
		this.strMeasure15 = strMeasure15;
		this.strMeasure16 = strMeasure16;
		this.strMeasure17 = strMeasure17;
		this.strMeasure18 = strMeasure18;
		this.strMeasure19 = strMeasure19;
		this.strMeasure20 = strMeasure20;
		this.strSource = strSource;
		this.dateModified = dateModified;
	}

	public meals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdMeal() {
		return idMeal;
	}

	public void setIdMeal(int idMeal) {
		this.idMeal = idMeal;
	}

	public String getStrMeal() {
		return strMeal;
	}

	public void setStrMeal(String strMeal) {
		this.strMeal = strMeal;
	}

	public String getStrDrinkAlternate() {
		return strDrinkAlternate;
	}

	public void setStrDrinkAlternate(String strDrinkAlternate) {
		this.strDrinkAlternate = strDrinkAlternate;
	}

	public String getStrCategory() {
		return strCategory;
	}

	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrInstructions() {
		return strInstructions;
	}

	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}

	public String getStrMealThumb() {
		return strMealThumb;
	}

	public void setStrMealThumb(String strMealThumb) {
		this.strMealThumb = strMealThumb;
	}

	public String getStrTags() {
		return strTags;
	}

	public void setStrTags(String strTags) {
		this.strTags = strTags;
	}

	public String getStrYoutube() {
		return strYoutube;
	}

	public void setStrYoutube(String strYoutube) {
		this.strYoutube = strYoutube;
	}

	public String getStrIngredient1() {
		return strIngredient1;
	}

	public void setStrIngredient1(String strIngredient1) {
		this.strIngredient1 = strIngredient1;
	}

	public String getStrIngredient2() {
		return strIngredient2;
	}

	public void setStrIngredient2(String strIngredient2) {
		this.strIngredient2 = strIngredient2;
	}

	public String getStrTingredient3() {
		return strTingredient3;
	}

	public void setStrTingredient3(String strTingredient3) {
		this.strTingredient3 = strTingredient3;
	}

	public String getStrIngredient4() {
		return strIngredient4;
	}

	public void setStrIngredient4(String strIngredient4) {
		this.strIngredient4 = strIngredient4;
	}

	public String getStrIngredient5() {
		return strIngredient5;
	}

	public void setStrIngredient5(String strIngredient5) {
		this.strIngredient5 = strIngredient5;
	}

	public String getStrIngredient6() {
		return strIngredient6;
	}

	public void setStrIngredient6(String strIngredient6) {
		this.strIngredient6 = strIngredient6;
	}

	public String getStrIngredient7() {
		return strIngredient7;
	}

	public void setStrIngredient7(String strIngredient7) {
		this.strIngredient7 = strIngredient7;
	}

	public String getStrIngredient8() {
		return strIngredient8;
	}

	public void setStrIngredient8(String strIngredient8) {
		this.strIngredient8 = strIngredient8;
	}

	public String getStrIngredient9() {
		return strIngredient9;
	}

	public void setStrIngredient9(String strIngredient9) {
		this.strIngredient9 = strIngredient9;
	}

	public String getStrIngredient10() {
		return strIngredient10;
	}

	public void setStrIngredient10(String strIngredient10) {
		this.strIngredient10 = strIngredient10;
	}

	public String getStrIngredient11() {
		return strIngredient11;
	}

	public void setStrIngredient11(String strIngredient11) {
		this.strIngredient11 = strIngredient11;
	}

	public String getStrIngredient12() {
		return strIngredient12;
	}

	public void setStrIngredient12(String strIngredient12) {
		this.strIngredient12 = strIngredient12;
	}

	public String getStrIngredient13() {
		return strIngredient13;
	}

	public void setStrIngredient13(String strIngredient13) {
		this.strIngredient13 = strIngredient13;
	}

	public String getStrIngredient14() {
		return strIngredient14;
	}

	public void setStrIngredient14(String strIngredient14) {
		this.strIngredient14 = strIngredient14;
	}

	public String getStrIngredient15() {
		return strIngredient15;
	}

	public void setStrIngredient15(String strIngredient15) {
		this.strIngredient15 = strIngredient15;
	}

	public String getStrIngredient16() {
		return strIngredient16;
	}

	public void setStrIngredient16(String strIngredient16) {
		this.strIngredient16 = strIngredient16;
	}

	public String getStrIngredient17() {
		return strIngredient17;
	}

	public void setStrIngredient17(String strIngredient17) {
		this.strIngredient17 = strIngredient17;
	}

	public String getStrIngredient18() {
		return strIngredient18;
	}

	public void setStrIngredient18(String strIngredient18) {
		this.strIngredient18 = strIngredient18;
	}

	public String getStrIngredient19() {
		return strIngredient19;
	}

	public void setStrIngredient19(String strIngredient19) {
		this.strIngredient19 = strIngredient19;
	}

	public String getStrIngredient20() {
		return strIngredient20;
	}

	public void setStrIngredient20(String strIngredient20) {
		this.strIngredient20 = strIngredient20;
	}

	public String getStrMeasure1() {
		return strMeasure1;
	}

	public void setStrMeasure1(String strMeasure1) {
		this.strMeasure1 = strMeasure1;
	}

	public String getStrMeasure2() {
		return strMeasure2;
	}

	public void setStrMeasure2(String strMeasure2) {
		this.strMeasure2 = strMeasure2;
	}

	public String getStrMeasure3() {
		return strMeasure3;
	}

	public void setStrMeasure3(String strMeasure3) {
		this.strMeasure3 = strMeasure3;
	}

	public String getStrMeasure4() {
		return strMeasure4;
	}

	public void setStrMeasure4(String strMeasure4) {
		this.strMeasure4 = strMeasure4;
	}

	public String getStrMeasure5() {
		return strMeasure5;
	}

	public void setStrMeasure5(String strMeasure5) {
		this.strMeasure5 = strMeasure5;
	}

	public String getStrMeasure6() {
		return strMeasure6;
	}

	public void setStrMeasure6(String strMeasure6) {
		this.strMeasure6 = strMeasure6;
	}

	public String getStrMeasure7() {
		return strMeasure7;
	}

	public void setStrMeasure7(String strMeasure7) {
		this.strMeasure7 = strMeasure7;
	}

	public String getStrMeasure8() {
		return strMeasure8;
	}

	public void setStrMeasure8(String strMeasure8) {
		this.strMeasure8 = strMeasure8;
	}

	public String getStrMeasure9() {
		return strMeasure9;
	}

	public void setStrMeasure9(String strMeasure9) {
		this.strMeasure9 = strMeasure9;
	}

	public String getStrMeasure10() {
		return strMeasure10;
	}

	public void setStrMeasure10(String strMeasure10) {
		this.strMeasure10 = strMeasure10;
	}

	public String getStrMeasure11() {
		return strMeasure11;
	}

	public void setStrMeasure11(String strMeasure11) {
		this.strMeasure11 = strMeasure11;
	}

	public String getStrMeasure12() {
		return strMeasure12;
	}

	public void setStrMeasure12(String strMeasure12) {
		this.strMeasure12 = strMeasure12;
	}

	public String getStrMeasure13() {
		return strMeasure13;
	}

	public void setStrMeasure13(String strMeasure13) {
		this.strMeasure13 = strMeasure13;
	}

	public String getStrMeasure14() {
		return strMeasure14;
	}

	public void setStrMeasure14(String strMeasure14) {
		this.strMeasure14 = strMeasure14;
	}

	public String getStrMeasure15() {
		return strMeasure15;
	}

	public void setStrMeasure15(String strMeasure15) {
		this.strMeasure15 = strMeasure15;
	}

	public String getStrMeasure16() {
		return strMeasure16;
	}

	public void setStrMeasure16(String strMeasure16) {
		this.strMeasure16 = strMeasure16;
	}

	public String getStrMeasure17() {
		return strMeasure17;
	}

	public void setStrMeasure17(String strMeasure17) {
		this.strMeasure17 = strMeasure17;
	}

	public String getStrMeasure18() {
		return strMeasure18;
	}

	public void setStrMeasure18(String strMeasure18) {
		this.strMeasure18 = strMeasure18;
	}

	public String getStrMeasure19() {
		return strMeasure19;
	}

	public void setStrMeasure19(String strMeasure19) {
		this.strMeasure19 = strMeasure19;
	}

	public String getStrMeasure20() {
		return strMeasure20;
	}

	public void setStrMeasure20(String strMeasure20) {
		this.strMeasure20 = strMeasure20;
	}

	public String getStrSource() {
		return strSource;
	}

	public void setStrSource(String strSource) {
		this.strSource = strSource;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateModified == null) ? 0 : dateModified.hashCode());
		result = prime * result + idMeal;
		result = prime * result + ((strArea == null) ? 0 : strArea.hashCode());
		result = prime * result + ((strCategory == null) ? 0 : strCategory.hashCode());
		result = prime * result + ((strDrinkAlternate == null) ? 0 : strDrinkAlternate.hashCode());
		result = prime * result + ((strIngredient1 == null) ? 0 : strIngredient1.hashCode());
		result = prime * result + ((strIngredient10 == null) ? 0 : strIngredient10.hashCode());
		result = prime * result + ((strIngredient11 == null) ? 0 : strIngredient11.hashCode());
		result = prime * result + ((strIngredient12 == null) ? 0 : strIngredient12.hashCode());
		result = prime * result + ((strIngredient13 == null) ? 0 : strIngredient13.hashCode());
		result = prime * result + ((strIngredient14 == null) ? 0 : strIngredient14.hashCode());
		result = prime * result + ((strIngredient15 == null) ? 0 : strIngredient15.hashCode());
		result = prime * result + ((strIngredient16 == null) ? 0 : strIngredient16.hashCode());
		result = prime * result + ((strIngredient17 == null) ? 0 : strIngredient17.hashCode());
		result = prime * result + ((strIngredient18 == null) ? 0 : strIngredient18.hashCode());
		result = prime * result + ((strIngredient19 == null) ? 0 : strIngredient19.hashCode());
		result = prime * result + ((strIngredient2 == null) ? 0 : strIngredient2.hashCode());
		result = prime * result + ((strIngredient20 == null) ? 0 : strIngredient20.hashCode());
		result = prime * result + ((strIngredient4 == null) ? 0 : strIngredient4.hashCode());
		result = prime * result + ((strIngredient5 == null) ? 0 : strIngredient5.hashCode());
		result = prime * result + ((strIngredient6 == null) ? 0 : strIngredient6.hashCode());
		result = prime * result + ((strIngredient7 == null) ? 0 : strIngredient7.hashCode());
		result = prime * result + ((strIngredient8 == null) ? 0 : strIngredient8.hashCode());
		result = prime * result + ((strIngredient9 == null) ? 0 : strIngredient9.hashCode());
		result = prime * result + ((strInstructions == null) ? 0 : strInstructions.hashCode());
		result = prime * result + ((strMeal == null) ? 0 : strMeal.hashCode());
		result = prime * result + ((strMealThumb == null) ? 0 : strMealThumb.hashCode());
		result = prime * result + ((strMeasure1 == null) ? 0 : strMeasure1.hashCode());
		result = prime * result + ((strMeasure10 == null) ? 0 : strMeasure10.hashCode());
		result = prime * result + ((strMeasure11 == null) ? 0 : strMeasure11.hashCode());
		result = prime * result + ((strMeasure12 == null) ? 0 : strMeasure12.hashCode());
		result = prime * result + ((strMeasure13 == null) ? 0 : strMeasure13.hashCode());
		result = prime * result + ((strMeasure14 == null) ? 0 : strMeasure14.hashCode());
		result = prime * result + ((strMeasure15 == null) ? 0 : strMeasure15.hashCode());
		result = prime * result + ((strMeasure16 == null) ? 0 : strMeasure16.hashCode());
		result = prime * result + ((strMeasure17 == null) ? 0 : strMeasure17.hashCode());
		result = prime * result + ((strMeasure18 == null) ? 0 : strMeasure18.hashCode());
		result = prime * result + ((strMeasure19 == null) ? 0 : strMeasure19.hashCode());
		result = prime * result + ((strMeasure2 == null) ? 0 : strMeasure2.hashCode());
		result = prime * result + ((strMeasure20 == null) ? 0 : strMeasure20.hashCode());
		result = prime * result + ((strMeasure3 == null) ? 0 : strMeasure3.hashCode());
		result = prime * result + ((strMeasure4 == null) ? 0 : strMeasure4.hashCode());
		result = prime * result + ((strMeasure5 == null) ? 0 : strMeasure5.hashCode());
		result = prime * result + ((strMeasure6 == null) ? 0 : strMeasure6.hashCode());
		result = prime * result + ((strMeasure7 == null) ? 0 : strMeasure7.hashCode());
		result = prime * result + ((strMeasure8 == null) ? 0 : strMeasure8.hashCode());
		result = prime * result + ((strMeasure9 == null) ? 0 : strMeasure9.hashCode());
		result = prime * result + ((strSource == null) ? 0 : strSource.hashCode());
		result = prime * result + ((strTags == null) ? 0 : strTags.hashCode());
		result = prime * result + ((strTingredient3 == null) ? 0 : strTingredient3.hashCode());
		result = prime * result + ((strYoutube == null) ? 0 : strYoutube.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		meals other = (meals) obj;
		if (dateModified == null) {
			if (other.dateModified != null)
				return false;
		} else if (!dateModified.equals(other.dateModified))
			return false;
		if (idMeal != other.idMeal)
			return false;
		if (strArea == null) {
			if (other.strArea != null)
				return false;
		} else if (!strArea.equals(other.strArea))
			return false;
		if (strCategory == null) {
			if (other.strCategory != null)
				return false;
		} else if (!strCategory.equals(other.strCategory))
			return false;
		if (strDrinkAlternate == null) {
			if (other.strDrinkAlternate != null)
				return false;
		} else if (!strDrinkAlternate.equals(other.strDrinkAlternate))
			return false;
		if (strIngredient1 == null) {
			if (other.strIngredient1 != null)
				return false;
		} else if (!strIngredient1.equals(other.strIngredient1))
			return false;
		if (strIngredient10 == null) {
			if (other.strIngredient10 != null)
				return false;
		} else if (!strIngredient10.equals(other.strIngredient10))
			return false;
		if (strIngredient11 == null) {
			if (other.strIngredient11 != null)
				return false;
		} else if (!strIngredient11.equals(other.strIngredient11))
			return false;
		if (strIngredient12 == null) {
			if (other.strIngredient12 != null)
				return false;
		} else if (!strIngredient12.equals(other.strIngredient12))
			return false;
		if (strIngredient13 == null) {
			if (other.strIngredient13 != null)
				return false;
		} else if (!strIngredient13.equals(other.strIngredient13))
			return false;
		if (strIngredient14 == null) {
			if (other.strIngredient14 != null)
				return false;
		} else if (!strIngredient14.equals(other.strIngredient14))
			return false;
		if (strIngredient15 == null) {
			if (other.strIngredient15 != null)
				return false;
		} else if (!strIngredient15.equals(other.strIngredient15))
			return false;
		if (strIngredient16 == null) {
			if (other.strIngredient16 != null)
				return false;
		} else if (!strIngredient16.equals(other.strIngredient16))
			return false;
		if (strIngredient17 == null) {
			if (other.strIngredient17 != null)
				return false;
		} else if (!strIngredient17.equals(other.strIngredient17))
			return false;
		if (strIngredient18 == null) {
			if (other.strIngredient18 != null)
				return false;
		} else if (!strIngredient18.equals(other.strIngredient18))
			return false;
		if (strIngredient19 == null) {
			if (other.strIngredient19 != null)
				return false;
		} else if (!strIngredient19.equals(other.strIngredient19))
			return false;
		if (strIngredient2 == null) {
			if (other.strIngredient2 != null)
				return false;
		} else if (!strIngredient2.equals(other.strIngredient2))
			return false;
		if (strIngredient20 == null) {
			if (other.strIngredient20 != null)
				return false;
		} else if (!strIngredient20.equals(other.strIngredient20))
			return false;
		if (strIngredient4 == null) {
			if (other.strIngredient4 != null)
				return false;
		} else if (!strIngredient4.equals(other.strIngredient4))
			return false;
		if (strIngredient5 == null) {
			if (other.strIngredient5 != null)
				return false;
		} else if (!strIngredient5.equals(other.strIngredient5))
			return false;
		if (strIngredient6 == null) {
			if (other.strIngredient6 != null)
				return false;
		} else if (!strIngredient6.equals(other.strIngredient6))
			return false;
		if (strIngredient7 == null) {
			if (other.strIngredient7 != null)
				return false;
		} else if (!strIngredient7.equals(other.strIngredient7))
			return false;
		if (strIngredient8 == null) {
			if (other.strIngredient8 != null)
				return false;
		} else if (!strIngredient8.equals(other.strIngredient8))
			return false;
		if (strIngredient9 == null) {
			if (other.strIngredient9 != null)
				return false;
		} else if (!strIngredient9.equals(other.strIngredient9))
			return false;
		if (strInstructions == null) {
			if (other.strInstructions != null)
				return false;
		} else if (!strInstructions.equals(other.strInstructions))
			return false;
		if (strMeal == null) {
			if (other.strMeal != null)
				return false;
		} else if (!strMeal.equals(other.strMeal))
			return false;
		if (strMealThumb == null) {
			if (other.strMealThumb != null)
				return false;
		} else if (!strMealThumb.equals(other.strMealThumb))
			return false;
		if (strMeasure1 == null) {
			if (other.strMeasure1 != null)
				return false;
		} else if (!strMeasure1.equals(other.strMeasure1))
			return false;
		if (strMeasure10 == null) {
			if (other.strMeasure10 != null)
				return false;
		} else if (!strMeasure10.equals(other.strMeasure10))
			return false;
		if (strMeasure11 == null) {
			if (other.strMeasure11 != null)
				return false;
		} else if (!strMeasure11.equals(other.strMeasure11))
			return false;
		if (strMeasure12 == null) {
			if (other.strMeasure12 != null)
				return false;
		} else if (!strMeasure12.equals(other.strMeasure12))
			return false;
		if (strMeasure13 == null) {
			if (other.strMeasure13 != null)
				return false;
		} else if (!strMeasure13.equals(other.strMeasure13))
			return false;
		if (strMeasure14 == null) {
			if (other.strMeasure14 != null)
				return false;
		} else if (!strMeasure14.equals(other.strMeasure14))
			return false;
		if (strMeasure15 == null) {
			if (other.strMeasure15 != null)
				return false;
		} else if (!strMeasure15.equals(other.strMeasure15))
			return false;
		if (strMeasure16 == null) {
			if (other.strMeasure16 != null)
				return false;
		} else if (!strMeasure16.equals(other.strMeasure16))
			return false;
		if (strMeasure17 == null) {
			if (other.strMeasure17 != null)
				return false;
		} else if (!strMeasure17.equals(other.strMeasure17))
			return false;
		if (strMeasure18 == null) {
			if (other.strMeasure18 != null)
				return false;
		} else if (!strMeasure18.equals(other.strMeasure18))
			return false;
		if (strMeasure19 == null) {
			if (other.strMeasure19 != null)
				return false;
		} else if (!strMeasure19.equals(other.strMeasure19))
			return false;
		if (strMeasure2 == null) {
			if (other.strMeasure2 != null)
				return false;
		} else if (!strMeasure2.equals(other.strMeasure2))
			return false;
		if (strMeasure20 == null) {
			if (other.strMeasure20 != null)
				return false;
		} else if (!strMeasure20.equals(other.strMeasure20))
			return false;
		if (strMeasure3 == null) {
			if (other.strMeasure3 != null)
				return false;
		} else if (!strMeasure3.equals(other.strMeasure3))
			return false;
		if (strMeasure4 == null) {
			if (other.strMeasure4 != null)
				return false;
		} else if (!strMeasure4.equals(other.strMeasure4))
			return false;
		if (strMeasure5 == null) {
			if (other.strMeasure5 != null)
				return false;
		} else if (!strMeasure5.equals(other.strMeasure5))
			return false;
		if (strMeasure6 == null) {
			if (other.strMeasure6 != null)
				return false;
		} else if (!strMeasure6.equals(other.strMeasure6))
			return false;
		if (strMeasure7 == null) {
			if (other.strMeasure7 != null)
				return false;
		} else if (!strMeasure7.equals(other.strMeasure7))
			return false;
		if (strMeasure8 == null) {
			if (other.strMeasure8 != null)
				return false;
		} else if (!strMeasure8.equals(other.strMeasure8))
			return false;
		if (strMeasure9 == null) {
			if (other.strMeasure9 != null)
				return false;
		} else if (!strMeasure9.equals(other.strMeasure9))
			return false;
		if (strSource == null) {
			if (other.strSource != null)
				return false;
		} else if (!strSource.equals(other.strSource))
			return false;
		if (strTags == null) {
			if (other.strTags != null)
				return false;
		} else if (!strTags.equals(other.strTags))
			return false;
		if (strTingredient3 == null) {
			if (other.strTingredient3 != null)
				return false;
		} else if (!strTingredient3.equals(other.strTingredient3))
			return false;
		if (strYoutube == null) {
			if (other.strYoutube != null)
				return false;
		} else if (!strYoutube.equals(other.strYoutube))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "meals [idMeal=" + idMeal + ", strMeal=" + strMeal + ", strDrinkAlternate=" + strDrinkAlternate
				+ ", strCategory=" + strCategory + ", strArea=" + strArea + ", strInstructions=" + strInstructions
				+ ", strMealThumb=" + strMealThumb + ", strTags=" + strTags + ", strYoutube=" + strYoutube
				+ ", strIngredient1=" + strIngredient1 + ", strIngredient2=" + strIngredient2 + ", strTingredient3="
				+ strTingredient3 + ", strIngredient4=" + strIngredient4 + ", strIngredient5=" + strIngredient5
				+ ", strIngredient6=" + strIngredient6 + ", strIngredient7=" + strIngredient7 + ", strIngredient8="
				+ strIngredient8 + ", strIngredient9=" + strIngredient9 + ", strIngredient10=" + strIngredient10
				+ ", strIngredient11=" + strIngredient11 + ", strIngredient12=" + strIngredient12 + ", strIngredient13="
				+ strIngredient13 + ", strIngredient14=" + strIngredient14 + ", strIngredient15=" + strIngredient15
				+ ", strIngredient16=" + strIngredient16 + ", strIngredient17=" + strIngredient17 + ", strIngredient18="
				+ strIngredient18 + ", strIngredient19=" + strIngredient19 + ", strIngredient20=" + strIngredient20
				+ ", strMeasure1=" + strMeasure1 + ", strMeasure2=" + strMeasure2 + ", strMeasure3=" + strMeasure3
				+ ", strMeasure4=" + strMeasure4 + ", strMeasure5=" + strMeasure5 + ", strMeasure6=" + strMeasure6
				+ ", strMeasure7=" + strMeasure7 + ", strMeasure8=" + strMeasure8 + ", strMeasure9=" + strMeasure9
				+ ", strMeasure10=" + strMeasure10 + ", strMeasure11=" + strMeasure11 + ", strMeasure12=" + strMeasure12
				+ ", strMeasure13=" + strMeasure13 + ", strMeasure14=" + strMeasure14 + ", strMeasure15=" + strMeasure15
				+ ", strMeasure16=" + strMeasure16 + ", strMeasure17=" + strMeasure17 + ", strMeasure18=" + strMeasure18
				+ ", strMeasure19=" + strMeasure19 + ", strMeasure20=" + strMeasure20 + ", strSource=" + strSource
				+ ", dateModified=" + dateModified + "]";
	}

}
