package hw19DynamicXpath;

public class DifferentTagsOfXpath {
	/* Tag 1: Tag with a single attribute (mostly used)
	 * Formula:
	 * //htmltag[@attributeName='attributeValue']
	 * Source: https://www.sephora.com/
	 * Search Box--->  //input[@id='site_search_input']
	 * Sign in button---> //button[@data-at='sign_in_button']
	 */
	
	/* Tag 2: Tag with multiple attribute with 'or' logic (not used much, used when any of the attribute can be find the locator faster) 
	 * Formula:
	 * //html tag [@attribute name = 'attribute value' or @another attribute name = 'another attribute value']
	 * Source: https://www.walgreens.com/
	 * Search Box---> //input[@class='blue-shadow' or @name='Ntt']  
	 */

	/* Tag 3: Tag with multiple attribute with 'and' logic
	 * Formula://html tag [@attribute name = 'attribute value' and @another attribute name = 'another attribute value']
	 * Source: https://www.montefiore.org/
	 * Search Box----> //input[@size='10' and @name='search']  
	 */
	
	/* Tag 4: Tag with inner text [means complete text] 
	 * Formula://html tag [text() = 'inner text']
	 * Source: https://www.target.com
	 * Categories---> //a[text()='Categories']
	 */
	
	/* Tag 5: Tag with inner text [not complete inner text rather partial text as well as actual text]
	 * Formula://html tag [contains(text(), 'partial or complete inner text value') ]
	 * Source: https://www.schools.nyc.gov/
	 * NYC DOE Text---> //h1[contains(text(), 'New York') ]
	 */
	
	/* Tag 6: Tag with attributes and use of contains (not commonly used)
	 * Formula://html tag [contains(@attribute, 'partial or complete attribute value') ]
	 * Source: https://www.schools.nyc.gov/
	 * NYC DOE//h1[contains(@class, 'visually-hidden') ]
	 */
	
	/* Tag 7: Normalize space -- eliminates leading and trailing spaces.
	 * Formula://html tag [normalize-space(text())='attribute value']
	 * Source: https://www.schools.nyc.gov/
	 * Find a school -----> //a[normalize-space(text())='Find a School' and @class='nav-link toplevel']
	 */
	
	/* Tag 8: Starts with text
	 * Formula: //html tag [starts-with(text(), 'attribute value')]
	 * Source: https://www.nychealthandhospitals.org/
	 * Vaccine---> //p[starts-with(text(), 'Get your COVID-19 Vaccine Today!')]
	 */
	
	/* Tag 9: Starts with attribute (not commonly used)
	 * Formula://html tag [starts-with(@attributes, 'attribute value']
	 * Source: https://www.nychealthandhospitals.org/
	 * Title Text---> //h1[starts-with(@class, 'title gray')]
	 */
}
