package com.app.RestAssurred;

public class Payload {
	
	
	
	public static String getPayload()
	{
		return "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 910,\r\n" + 
				"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Selenium Python\",\r\n" + 
				"      \"price\": 50,\r\n" + 
				"      \"copies\": 6\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Cypress\",\r\n" + 
				"      \"price\": 40,\r\n" + 
				"      \"copies\": 4\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"RPA\",\r\n" + 
				"      \"price\": 45,\r\n" + 
				"      \"copies\": 10\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
	}
	
	
	
	public static String getPostCodePayload(String postcode)
	{
		return "{\r\n" + 
				"  \"postcodes\" : [\""+postcode+"\"]\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"";
	}
	
	
	public static  String  getNetworkPayload()
	{
		return "{\r\n" + 
		"    \"networks\": [\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ЗАО «СитиБайк»\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velobike-moscow\",\r\n" + 
		"            \"id\": \"velobike-moscow\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Moscow\",\r\n" + 
		"                \"country\": \"RU\",\r\n" + 
		"                \"latitude\": 55.75,\r\n" + 
		"                \"longitude\": 37.616667\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velobike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Gobike A/S\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bycyklen\",\r\n" + 
		"            \"id\": \"bycyklen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Copenhagen\",\r\n" + 
		"                \"country\": \"DK\",\r\n" + 
		"                \"latitude\": 55.673582,\r\n" + 
		"                \"longitude\": 12.564984\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bycyklen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Gobike A/S\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nu-connect\",\r\n" + 
		"            \"id\": \"nu-connect\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Utrecht\",\r\n" + 
		"                \"country\": \"NL\",\r\n" + 
		"                \"latitude\": 52.117,\r\n" + 
		"                \"longitude\": 5.067\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nu-Connect\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Urban Infrastructure Partner\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/baerum-bysykkel\",\r\n" + 
		"            \"id\": \"baerum-bysykkel\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bærum\",\r\n" + 
		"                \"country\": \"NO\",\r\n" + 
		"                \"latitude\": 59.89455,\r\n" + 
		"                \"longitude\": 10.546343\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bysykkel\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Gobike A/S\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bysykkelen\",\r\n" + 
		"            \"id\": \"bysykkelen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Stavanger\",\r\n" + 
		"                \"country\": \"NO\",\r\n" + 
		"                \"latitude\": 58.969975,\r\n" + 
		"                \"longitude\": 5.733107\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bysykkelen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-a-rua\",\r\n" + 
		"            \"id\": \"onroll-a-rua\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"A Rúa\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.392049,\r\n" + 
		"                \"longitude\": -7.114634\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-albacete\",\r\n" + 
		"            \"id\": \"onroll-albacete\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Albacete\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.98913,\r\n" + 
		"                \"longitude\": -1.858485\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-alhama-de-murcia\",\r\n" + 
		"            \"id\": \"onroll-alhama-de-murcia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Alhama de Murcia\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.849831,\r\n" + 
		"                \"longitude\": -1.424891\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-almunecar\",\r\n" + 
		"            \"id\": \"onroll-almunecar\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Almuñécar\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 36.735789,\r\n" + 
		"                \"longitude\": -3.688828\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-antequera\",\r\n" + 
		"            \"id\": \"onroll-antequera\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Antequera\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.018427,\r\n" + 
		"                \"longitude\": -4.563775\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-aranda-de-duero\",\r\n" + 
		"            \"id\": \"onroll-aranda-de-duero\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Aranda de Duero\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 41.667601,\r\n" + 
		"                \"longitude\": -3.689526\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-aranjuez\",\r\n" + 
		"            \"id\": \"onroll-aranjuez\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Aranjuez\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.03097,\r\n" + 
		"                \"longitude\": -3.605742\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-badajoz\",\r\n" + 
		"            \"id\": \"onroll-badajoz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Badajoz\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.873627,\r\n" + 
		"                \"longitude\": -6.99451\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-baeza\",\r\n" + 
		"            \"id\": \"onroll-baeza\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Baeza\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.99537,\r\n" + 
		"                \"longitude\": -3.468248\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-benidorm\",\r\n" + 
		"            \"id\": \"onroll-benidorm\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Benidorm\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.541251,\r\n" + 
		"                \"longitude\": -0.126808\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-blanca\",\r\n" + 
		"            \"id\": \"onroll-blanca\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Blanca\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.178195,\r\n" + 
		"                \"longitude\": -1.372402\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-cieza\",\r\n" + 
		"            \"id\": \"onroll-cieza\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cieza\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.239139,\r\n" + 
		"                \"longitude\": -1.417262\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-don-benito-villanueva\",\r\n" + 
		"            \"id\": \"onroll-don-benito-villanueva\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Don Benito - Villanueva\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.964699,\r\n" + 
		"                \"longitude\": -5.829693\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-el-campello\",\r\n" + 
		"            \"id\": \"onroll-el-campello\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"El Campello\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.419616,\r\n" + 
		"                \"longitude\": -0.398388\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-elche\",\r\n" + 
		"            \"id\": \"onroll-elche\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Elche\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.2668,\r\n" + 
		"                \"longitude\": -0.696217\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-guadalajara\",\r\n" + 
		"            \"id\": \"onroll-guadalajara\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Guadalajara\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.633021,\r\n" + 
		"                \"longitude\": -3.166097\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-jaen\",\r\n" + 
		"            \"id\": \"onroll-jaen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Jaén\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.777738,\r\n" + 
		"                \"longitude\": -3.790758\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-lalin\",\r\n" + 
		"            \"id\": \"onroll-lalin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lalín\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.658626,\r\n" + 
		"                \"longitude\": -8.114976\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-las-palmas\",\r\n" + 
		"            \"id\": \"onroll-las-palmas\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Las Palmas de Gran Canaria\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 28.124302,\r\n" + 
		"                \"longitude\": -15.425994\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-montilla\",\r\n" + 
		"            \"id\": \"onroll-montilla\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Montilla\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.584151,\r\n" + 
		"                \"longitude\": -4.641359\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-novelda\",\r\n" + 
		"            \"id\": \"onroll-novelda\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Novelda\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.386447,\r\n" + 
		"                \"longitude\": -0.767134\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-mula\",\r\n" + 
		"            \"id\": \"onroll-mula\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mula\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.040805,\r\n" + 
		"                \"longitude\": -1.497451\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-o-barco\",\r\n" + 
		"            \"id\": \"onroll-o-barco\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"O Barco\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.413993,\r\n" + 
		"                \"longitude\": -6.982913\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-palencia\",\r\n" + 
		"            \"id\": \"onroll-palencia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Palencia\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.005639,\r\n" + 
		"                \"longitude\": -4.527022\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-paiporta\",\r\n" + 
		"            \"id\": \"onroll-paiporta\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Paiporta\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 39.427609,\r\n" + 
		"                \"longitude\": -0.416876\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-pinto\",\r\n" + 
		"            \"id\": \"onroll-pinto\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pinto\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.245741,\r\n" + 
		"                \"longitude\": -3.698611\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-priego-de-cordoba\",\r\n" + 
		"            \"id\": \"onroll-priego-de-cordoba\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Priego de Córdoba\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.440517,\r\n" + 
		"                \"longitude\": -4.201188\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-puerto-lumbreras\",\r\n" + 
		"            \"id\": \"onroll-puerto-lumbreras\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Puerto Lumbreras\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.556652,\r\n" + 
		"                \"longitude\": -1.811508\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-puertollano\",\r\n" + 
		"            \"id\": \"onroll-puertollano\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Puertollano\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.691396,\r\n" + 
		"                \"longitude\": -4.107794\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-redondela\",\r\n" + 
		"            \"id\": \"onroll-redondela\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Redondela\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.299964,\r\n" + 
		"                \"longitude\": -8.615428\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-salamanca\",\r\n" + 
		"            \"id\": \"onroll-salamanca\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Salamanca\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.966771,\r\n" + 
		"                \"longitude\": -5.665432\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-san-javier\",\r\n" + 
		"            \"id\": \"onroll-san-javier\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Javier\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.783704,\r\n" + 
		"                \"longitude\": -0.808097\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-san-pedro\",\r\n" + 
		"            \"id\": \"onroll-san-pedro\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Pedro del Pinatar\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.827578,\r\n" + 
		"                \"longitude\": -0.783944\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-sant-joan\",\r\n" + 
		"            \"id\": \"onroll-sant-joan\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sant Joan d'Alacant\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.399839,\r\n" + 
		"                \"longitude\": -0.434522\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-segovia\",\r\n" + 
		"            \"id\": \"onroll-segovia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Segovia\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.941941,\r\n" + 
		"                \"longitude\": -4.112397\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-soria\",\r\n" + 
		"            \"id\": \"onroll-soria\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Soria\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 41.763653,\r\n" + 
		"                \"longitude\": -2.467069\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-talavera\",\r\n" + 
		"            \"id\": \"onroll-talavera\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Talavera de la Reina\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 39.961829,\r\n" + 
		"                \"longitude\": -4.830319\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-ubeda\",\r\n" + 
		"            \"id\": \"onroll-ubeda\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Úbeda\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.011463,\r\n" + 
		"                \"longitude\": -3.373276\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-universidad-de-granada\",\r\n" + 
		"            \"id\": \"onroll-universidad-de-granada\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Universidad de Granada, Granada\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.182438,\r\n" + 
		"                \"longitude\": -3.604219\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-siena\",\r\n" + 
		"            \"id\": \"bicincitta-siena\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Siena\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.3186,\r\n" + 
		"                \"longitude\": 11.3306\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=202\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-via-verde\",\r\n" + 
		"            \"id\": \"onroll-via-verde\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Noia - Portosin - Porto do Son\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.768127,\r\n" + 
		"                \"longitude\": -8.908513\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll Via Verde\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-villaquilambre\",\r\n" + 
		"            \"id\": \"onroll-villaquilambre\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Villaquilambre\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.642358,\r\n" + 
		"                \"longitude\": -5.535311\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Domoblue\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/onroll-vinaros\",\r\n" + 
		"            \"id\": \"onroll-vinaros\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vinaròs\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.468258,\r\n" + 
		"                \"longitude\": 0.466972\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Onroll\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-maroussi\",\r\n" + 
		"            \"id\": \"cyclopolis-maroussi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Maroussi\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 38.0568722388,\r\n" + 
		"                \"longitude\": 23.8083299536\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Groundwork\",\r\n" + 
		"                \"Slough Borough Council\",\r\n" + 
		"                \"ITS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cycle-hire-slough\",\r\n" + 
		"            \"id\": \"cycle-hire-slough\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Slough\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 51.51135,\r\n" + 
		"                \"longitude\": -0.591562\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cycle Hire\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-nafplio\",\r\n" + 
		"            \"id\": \"cyclopolis-nafplio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Maroussi\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.5639397319,\r\n" + 
		"                \"longitude\": 22.8093402872\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-parco-dei-colli-di-bergamo\",\r\n" + 
		"            \"id\": \"bicincitta-parco-dei-colli-di-bergamo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Parco dei Colli di Bergamo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.72295637032245,\r\n" + 
		"                \"longitude\": 9.649230073016383\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=203\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-aigialeia\",\r\n" + 
		"            \"id\": \"cyclopolis-aigialeia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Maroussi\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 38.2511101325,\r\n" + 
		"                \"longitude\": 22.0821570196\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-marathon\",\r\n" + 
		"            \"id\": \"cyclopolis-marathon\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Marathon\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 38.0855680022,\r\n" + 
		"                \"longitude\": 23.9776389963\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-mantova\",\r\n" + 
		"            \"id\": \"bicincitta-mantova\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mantova\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.15866370764634,\r\n" + 
		"                \"longitude\": 10.783718973016335\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=204\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-neasmyrni\",\r\n" + 
		"            \"id\": \"cyclopolis-neasmyrni\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Νea Smyrni\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.9381,\r\n" + 
		"                \"longitude\": 23.7126\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-moschatotavros\",\r\n" + 
		"            \"id\": \"cyclopolis-moschatotavros\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Μoschato-Tavros\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.9538991434,\r\n" + 
		"                \"longitude\": 23.6824746661\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-arxaiaolympia\",\r\n" + 
		"            \"id\": \"cyclopolis-arxaiaolympia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Αrxaia Olympia\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.6419700934,\r\n" + 
		"                \"longitude\": 21.6247265179\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-kiato\",\r\n" + 
		"            \"id\": \"cyclopolis-kiato\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kιato\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 38.0132674508,\r\n" + 
		"                \"longitude\": 22.7493819902\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-assemini\",\r\n" + 
		"            \"id\": \"bicincitta-assemini\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Assemini\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.28956306007679,\r\n" + 
		"                \"longitude\": 9.006601555294765\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=205\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-rhodes\",\r\n" + 
		"            \"id\": \"cyclopolis-rhodes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rhodes\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 36.4509118,\r\n" + 
		"                \"longitude\": 28.2246966\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-florina\",\r\n" + 
		"            \"id\": \"cyclopolis-florina\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Florina\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 40.8016111,\r\n" + 
		"                \"longitude\": 21.4245222\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-tortoli\",\r\n" + 
		"            \"id\": \"bicincitta-tortoli\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tortolì\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.92664489852196,\r\n" + 
		"                \"longitude\": 9.654953570777934\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=206\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyclopolis Systems\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclopolis-limnos\",\r\n" + 
		"            \"id\": \"cyclopolis-limnos\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Limnos\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 39.8747861,\r\n" + 
		"                \"longitude\": 25.0586722\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclopolis\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-gaeta\",\r\n" + 
		"            \"id\": \"bicincitta-gaeta\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gaeta\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 41.209620965538036,\r\n" + 
		"                \"longitude\": 13.584335125656139\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=207\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-borgarello\",\r\n" + 
		"            \"id\": \"bicincitta-borgarello\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Borgarello\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.23963753440171,\r\n" + 
		"                \"longitude\": 9.136150475640875\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=208\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-pizzighettone-formigara\",\r\n" + 
		"            \"id\": \"bicincitta-pizzighettone-formigara\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pizzighettone e Formigara\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.186748819167434,\r\n" + 
		"                \"longitude\": 9.778087948479424\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=209\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"The National Transport Authority\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cork\",\r\n" + 
		"            \"id\": \"cork\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cork\",\r\n" + 
		"                \"country\": \"IE\",\r\n" + 
		"                \"latitude\": 51.893604,\r\n" + 
		"                \"longitude\": -8.494174\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Coca-Cola Zero® Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"The National Transport Authority\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/limerick\",\r\n" + 
		"            \"id\": \"limerick\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Limerick\",\r\n" + 
		"                \"country\": \"IE\",\r\n" + 
		"                \"latitude\": 52.668746,\r\n" + 
		"                \"longitude\": -8.627809\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Coca-Cola Zero® Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BTS Group Holdings\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/punpunbikeshare\",\r\n" + 
		"            \"id\": \"punpunbikeshare\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bangkok\",\r\n" + 
		"                \"country\": \"TH\",\r\n" + 
		"                \"latitude\": 13.75,\r\n" + 
		"                \"longitude\": 100.516667\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Pun Pun Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"The National Transport Authority\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/galway\",\r\n" + 
		"            \"id\": \"galway\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Galway\",\r\n" + 
		"                \"country\": \"IE\",\r\n" + 
		"                \"latitude\": 53.2783491544,\r\n" + 
		"                \"longitude\": -9.05069143207\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Coca-Cola Zero® Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Bike U Sp. z o.o.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bbbike\",\r\n" + 
		"            \"id\": \"bbbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bielsko-Biała\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 49.8225,\r\n" + 
		"                \"longitude\": 19.044444\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BBBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-montecatini-terme\",\r\n" + 
		"            \"id\": \"bicincitta-montecatini-terme\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Montecatini Terme\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.88362791665083,\r\n" + 
		"                \"longitude\": 10.764385656591799\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=210\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Bike U Sp. z o.o.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikeu-bra\",\r\n" + 
		"            \"id\": \"bikeu-bra\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bydgoszcz\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 53.12193,\r\n" + 
		"                \"longitude\": 18.00038\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bydgoski rower aglomeracyjny\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"PBSC\",\r\n" + 
		"                \"Serco Group plc\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/santander-cycles\",\r\n" + 
		"            \"id\": \"santander-cycles\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"London\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 51.51121389999999,\r\n" + 
		"                \"longitude\": -0.1198244\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Santander Cycles\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"PBSC\",\r\n" + 
		"                \"Alta Bicycle Share, Inc\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://asp.publicbikesystem.net/ube/gbfs/v1/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/we-cycle\",\r\n" + 
		"            \"id\": \"we-cycle\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Aspen, CO\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.194951,\r\n" + 
		"                \"longitude\": -106.837002\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"WE-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-carrara\",\r\n" + 
		"            \"id\": \"bicincitta-carrara\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Carrara\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.07731805550891,\r\n" + 
		"                \"longitude\": 10.097172450401331\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=211\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"PBSC\",\r\n" + 
		"                \"Alta Bicycle Share, Inc\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/wowcycle-reykjavik\",\r\n" + 
		"            \"id\": \"wowcycle-reykjavik\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Reykjavík\",\r\n" + 
		"                \"country\": \"IS\",\r\n" + 
		"                \"latitude\": 64.128288,\r\n" + 
		"                \"longitude\": -21.827774\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"WOW Citybike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Transparenzportal Hamburg\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/stadtrad-hamburg\",\r\n" + 
		"            \"id\": \"stadtrad-hamburg\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Data licence Germany – attribution – version 2.0\",\r\n" + 
		"                \"url\": \"https://www.govdata.de/dl-de/by-2-0\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hamburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 53.57532,\r\n" + 
		"                \"longitude\": 10.01534\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"StadtRAD Hamburg'\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tigullionbike\",\r\n" + 
		"            \"id\": \"tigullionbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sestri Levante - Lavagna\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.272554,\r\n" + 
		"                \"longitude\": 9.395714\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tigullionbike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=80\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/arbike\",\r\n" + 
		"            \"id\": \"arbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Arezzo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.473333,\r\n" + 
		"                \"longitude\": 11.87\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ARbike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=84\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Velobike.kz, LLP\",\r\n" + 
		"                \"Smoove\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velobike\",\r\n" + 
		"            \"id\": \"velobike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Astana\",\r\n" + 
		"                \"country\": \"KZ\",\r\n" + 
		"                \"latitude\": 51.166667,\r\n" + 
		"                \"longitude\": 71.416667\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velobike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Smovengo\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velib\",\r\n" + 
		"            \"id\": \"velib\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Paris\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 48.856614,\r\n" + 
		"                \"longitude\": 2.3522219\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velib' Métropôle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ascoli-piceno\",\r\n" + 
		"            \"id\": \"ascoli-piceno\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ascoli Piceno\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 42.85,\r\n" + 
		"                \"longitude\": 13.583333\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Ascoli Piceno\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=73\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bigi\",\r\n" + 
		"            \"id\": \"bigi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bergamo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.695,\r\n" + 
		"                \"longitude\": 9.67\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BiGi\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=133\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ICNITA S.L.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/girocleta\",\r\n" + 
		"            \"id\": \"girocleta\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Girona\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 41.9794005,\r\n" + 
		"                \"longitude\": 2.8214264\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Girocleta\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/alba\",\r\n" + 
		"            \"id\": \"alba\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Alba\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.716667,\r\n" + 
		"                \"longitude\": 8.083333\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Alba\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=139\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ClearChannel\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikemi\",\r\n" + 
		"            \"id\": \"bikemi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Milano\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.4654542,\r\n" + 
		"                \"longitude\": 9.186516\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeMi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/biella\",\r\n" + 
		"            \"id\": \"biella\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Biella\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.5775,\r\n" + 
		"                \"longitude\": 8.051111\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Biella\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=112\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/chivasso\",\r\n" + 
		"            \"id\": \"chivasso\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Chivasso\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.189765,\r\n" + 
		"                \"longitude\": 7.888935\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Chivasso\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=201\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ClearChannel\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bizi\",\r\n" + 
		"            \"id\": \"bizi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zaragoza\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 41.6487908,\r\n" + 
		"                \"longitude\": -0.8895811\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bizi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ClearChannel\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ecobici\",\r\n" + 
		"            \"id\": \"ecobici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cd de México\",\r\n" + 
		"                \"country\": \"MX\",\r\n" + 
		"                \"latitude\": 19.4326077,\r\n" + 
		"                \"longitude\": -99.133208\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EcoBici\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bici-in-busto\",\r\n" + 
		"            \"id\": \"bici-in-busto\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Busto Arsizio\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.610555,\r\n" + 
		"                \"longitude\": 8.852062\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bici in Busto\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=66\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ClearChannel\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velo-antwerpen\",\r\n" + 
		"            \"id\": \"velo-antwerpen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Antwerpen\",\r\n" + 
		"                \"country\": \"BE\",\r\n" + 
		"                \"latitude\": 51.216667,\r\n" + 
		"                \"longitude\": 4.4\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velo Antwerpen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cuneo\",\r\n" + 
		"            \"id\": \"cuneo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cuneo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.384238,\r\n" + 
		"                \"longitude\": 7.541428\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cuneo\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=39\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ClearChannel\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/malmobybike\",\r\n" + 
		"            \"id\": \"malmobybike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Malmö\",\r\n" + 
		"                \"country\": \"SE\",\r\n" + 
		"                \"latitude\": 55.605,\r\n" + 
		"                \"longitude\": 13.0038\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Malmö by bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ClearChannel\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicilascondes\",\r\n" + 
		"            \"id\": \"bicilascondes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Las Condes\",\r\n" + 
		"                \"country\": \"CL\",\r\n" + 
		"                \"latitude\": -33.401944,\r\n" + 
		"                \"longitude\": -70.55\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bici las Condes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": \"Empresa Municipal de Transportes de Madrid, S.A.\",\r\n" + 
		"            \"href\": \"/v2/networks/bicimad\",\r\n" + 
		"            \"id\": \"bicimad\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Madrid\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.4168,\r\n" + 
		"                \"longitude\": -3.7038\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BiciMAD\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-didymoteicho\",\r\n" + 
		"            \"id\": \"easybike-didymoteicho\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Didymoteicho\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 41.3502539849,\r\n" + 
		"                \"longitude\": 26.4972960949\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/free-bike-sharing\",\r\n" + 
		"            \"id\": \"free-bike-sharing\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Frosinone\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 41.645081,\r\n" + 
		"                \"longitude\": 13.342123\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"FRee Bike sharing\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=53\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-glyfada\",\r\n" + 
		"            \"id\": \"easybike-glyfada\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Glyfada\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.8715809825,\r\n" + 
		"                \"longitude\": 23.7355544376\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-igoumenitsa\",\r\n" + 
		"            \"id\": \"easybike-igoumenitsa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Igoumenitsa\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 39.5005770633,\r\n" + 
		"                \"longitude\": 20.2635206985\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lecce\",\r\n" + 
		"            \"id\": \"lecce\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lecce\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.35040350928062,\r\n" + 
		"                \"longitude\": 18.177824020385742\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"lecce\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=159\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-ioannina\",\r\n" + 
		"            \"id\": \"easybike-ioannina\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ioannina\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 39.6639818,\r\n" + 
		"                \"longitude\": 20.8522784\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-karditsa\",\r\n" + 
		"            \"id\": \"easybike-karditsa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Karditsa\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 39.3634604,\r\n" + 
		"                \"longitude\": 21.9211192\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/manerba-in-bici\",\r\n" + 
		"            \"id\": \"manerba-in-bici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Manerba del Garda\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.561179,\r\n" + 
		"                \"longitude\": 10.559406\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Manerba in Bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=102\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-kavala\",\r\n" + 
		"            \"id\": \"easybike-kavala\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kavala\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 40.9369068,\r\n" + 
		"                \"longitude\": 24.4122164\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-kinouria\",\r\n" + 
		"            \"id\": \"easybike-kinouria\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kinouria\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.1476704305,\r\n" + 
		"                \"longitude\": 22.8933729935\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-komotini\",\r\n" + 
		"            \"id\": \"easybike-komotini\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Komotini\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 41.117833,\r\n" + 
		"                \"longitude\": 25.4041307\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-patra\",\r\n" + 
		"            \"id\": \"easybike-patra\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Patra\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 38.2410966371,\r\n" + 
		"                \"longitude\": 21.7259683418\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/mar-e-bici\",\r\n" + 
		"            \"id\": \"mar-e-bici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Marciana Marina\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 42.805855,\r\n" + 
		"                \"longitude\": 10.196514\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mar e Bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=90\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-rethymno\",\r\n" + 
		"            \"id\": \"easybike-rethymno\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rethymno\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 35.3667571777,\r\n" + 
		"                \"longitude\": 24.4832845736\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-samos\",\r\n" + 
		"            \"id\": \"easybike-samos\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Samos\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.754065919,\r\n" + 
		"                \"longitude\": 26.9787850189\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/novara\",\r\n" + 
		"            \"id\": \"novara\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Novara\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.44574,\r\n" + 
		"                \"longitude\": 8.622165\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Novara\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=131\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-nicosia\",\r\n" + 
		"            \"id\": \"easybike-nicosia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nicosia\",\r\n" + 
		"                \"country\": \"CY\",\r\n" + 
		"                \"latitude\": 35.1739302,\r\n" + 
		"                \"longitude\": 33.364726\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-mani\",\r\n" + 
		"            \"id\": \"easybike-mani\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mani\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 41.4097472,\r\n" + 
		"                \"longitude\": 26.4024952\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/easybike-irakleio\",\r\n" + 
		"            \"id\": \"easybike-irakleio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Irakleio\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 35.338735,\r\n" + 
		"                \"longitude\": 25.144213\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EasyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/thessbike\",\r\n" + 
		"            \"id\": \"thessbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Thessaloniki\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 40.6403167,\r\n" + 
		"                \"longitude\": 22.9352716\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ThessBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Brainbox Technology\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/athens-bikes\",\r\n" + 
		"            \"id\": \"athens-bikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Athens\",\r\n" + 
		"                \"country\": \"GR\",\r\n" + 
		"                \"latitude\": 37.9838,\r\n" + 
		"                \"longitude\": 23.7275\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"AthensBikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/goodbike\",\r\n" + 
		"            \"id\": \"goodbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Padova\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.4064349,\r\n" + 
		"                \"longitude\": 11.8767611\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"GoodBike\",\r\n" + 
		"            \"source\": \"http://www.goodbikepadova.it/frmLeStazioni.aspx?ID=59\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"PegBike\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ciclosampa\",\r\n" + 
		"            \"id\": \"ciclosampa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"São Paulo\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -23.55,\r\n" + 
		"                \"longitude\": -46.6333\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"CicloSampa\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tuimil S.A.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicicorunha\",\r\n" + 
		"            \"id\": \"bicicorunha\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"A Coruña\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 43.3623,\r\n" + 
		"                \"longitude\": -8.4115\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicicoruña\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tuimil S.A.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bici-ferrol-terra\",\r\n" + 
		"            \"id\": \"bici-ferrol-terra\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ferrol - Narón\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 43.4896,\r\n" + 
		"                \"longitude\": -8.2193\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BiciFerrolTerra\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://curtinbikeshare.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/curtin-bike-share\",\r\n" + 
		"            \"id\": \"curtin-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Curtin University, Perth, WA\",\r\n" + 
		"                \"country\": \"AU\",\r\n" + 
		"                \"latitude\": -32.0034172153127,\r\n" + 
		"                \"longitude\": 115.89431270956993\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Curtin Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://monashbikeshare.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/monash-bikeshare\",\r\n" + 
		"            \"id\": \"monash-bikeshare\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Melbourne, AU\",\r\n" + 
		"                \"country\": \"AU\",\r\n" + 
		"                \"latitude\": -37.91238410208696,\r\n" + 
		"                \"longitude\": 145.1362281292677\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Monash BikeShare\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/mimuovofe\",\r\n" + 
		"            \"id\": \"mimuovofe\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ferrara\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.8350382,\r\n" + 
		"                \"longitude\": 11.6240562\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=142\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc.\",\r\n" + 
		"                \"PBSC Urban Solutions\",\r\n" + 
		"                \"BIXI Montréal\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://api-core.bixi.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/bixi-montreal\",\r\n" + 
		"            \"id\": \"bixi-montreal\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Montréal, QC\",\r\n" + 
		"                \"country\": \"CA\",\r\n" + 
		"                \"latitude\": 45.508693,\r\n" + 
		"                \"longitude\": -73.553928\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bixi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/parma\",\r\n" + 
		"            \"id\": \"parma\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Parma\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.801485,\r\n" + 
		"                \"longitude\": 10.3279036\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=58\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc.\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://tor.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bixi-toronto\",\r\n" + 
		"            \"id\": \"bixi-toronto\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Toronto, ON\",\r\n" + 
		"                \"country\": \"CA\",\r\n" + 
		"                \"latitude\": 43.653226,\r\n" + 
		"                \"longitude\": -79.3831843\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bike Share Toronto\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://hamilton.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/sobi-hamilton\",\r\n" + 
		"            \"id\": \"sobi-hamilton\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hamilton, ON\",\r\n" + 
		"                \"country\": \"CA\",\r\n" + 
		"                \"latitude\": 43.25643601915583,\r\n" + 
		"                \"longitude\": -79.86929655075073\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SoBi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"CycleHop, LLC\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://velogo.ca/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/velogo\",\r\n" + 
		"            \"id\": \"velogo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ottawa, ON\",\r\n" + 
		"                \"country\": \"CA\",\r\n" + 
		"                \"latitude\": 45.4285325522342,\r\n" + 
		"                \"longitude\": -75.6970576741095\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VeloGO\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Clean Energy Coalition\",\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_arborbike/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/arborbike\",\r\n" + 
		"            \"id\": \"arborbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ann Arbor, MI\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 42.27853,\r\n" + 
		"                \"longitude\": -83.74536\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ArborBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/pavia-in-bici\",\r\n" + 
		"            \"id\": \"pavia-in-bici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pavia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.1847248,\r\n" + 
		"                \"longitude\": 9.1582069\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Pavia in bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=45\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bici-perugia\",\r\n" + 
		"            \"id\": \"bici-perugia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Perugia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.1107168,\r\n" + 
		"                \"longitude\": 12.3908279\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bici Perugia\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=122\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_austin/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/austin\",\r\n" + 
		"            \"id\": \"austin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Austin, TX\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 30.26408,\r\n" + 
		"                \"longitude\": -97.74355\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Austin B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc\",\r\n" + 
		"                \"PBSC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://chat.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bike-chattanooga\",\r\n" + 
		"            \"id\": \"bike-chattanooga\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Chattanooga, TN\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 35.0456297,\r\n" + 
		"                \"longitude\": -85.3096801\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bike Chattanooga\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/piacenza\",\r\n" + 
		"            \"id\": \"piacenza\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Piacenza\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.0473754,\r\n" + 
		"                \"longitude\": 9.6865813\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=148\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/pinerolo\",\r\n" + 
		"            \"id\": \"pinerolo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pinerolo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.8850256,\r\n" + 
		"                \"longitude\": 7.3499953\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Pinerolo\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=71\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Portland Bureau of Transportation (PBOT)\",\r\n" + 
		"                \"Motivate International, Inc\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://biketownpdx.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/biketown\",\r\n" + 
		"            \"id\": \"biketown\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Portland, OR\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 45.52175423291714,\r\n" + 
		"                \"longitude\": -122.68107935786247\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BIKETOWN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/reggio-emilia\",\r\n" + 
		"            \"id\": \"reggio-emilia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Reggio Emilia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.6989932,\r\n" + 
		"                \"longitude\": 10.6296859\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=155\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"CycleHop, LLC\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://britebikes.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/britebikes\",\r\n" + 
		"            \"id\": \"britebikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Ramon, CA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 37.759444753878,\r\n" + 
		"                \"longitude\": -121.955134881881\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BRiteBikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ValleyRide\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://boise.greenbike.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/boise-greenbike\",\r\n" + 
		"            \"id\": \"boise-greenbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Boise, ID\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 43.6153060610528,\r\n" + 
		"                \"longitude\": -116.201761349309\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Boise GreenBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_boulder/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/boulder\",\r\n" + 
		"            \"id\": \"boulder\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Boulder, CO\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.00811,\r\n" + 
		"                \"longitude\": -105.26385\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Boulder B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"CycleHop, LLC\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://santamonicabikeshare.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/breeze-bike-share\",\r\n" + 
		"            \"id\": \"breeze-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Santa Monica, CA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 34.01780925008178,\r\n" + 
		"                \"longitude\": -118.4965717792511\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Breeze Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rimini\",\r\n" + 
		"            \"id\": \"rimini\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rimini\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.0570817,\r\n" + 
		"                \"longitude\": 12.5646003\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=149\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_broward/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/broward\",\r\n" + 
		"            \"id\": \"broward\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Fort Lauderdale, FL\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 26.12026,\r\n" + 
		"                \"longitude\": -80.14819\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Broward B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_bublr/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/bublr-bikes\",\r\n" + 
		"            \"id\": \"bublr-bikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Milwaukee, WI\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 43.0369,\r\n" + 
		"                \"longitude\": -87.89667\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bublr Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Shared Mobility Inc.\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://reddybikeshare.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/reddy-bike-share\",\r\n" + 
		"            \"id\": \"reddy-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Buffalo, NY\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 42.89373841865211,\r\n" + 
		"                \"longitude\": -78.8718044757843\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Reddy Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc.\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.capitalbikeshare.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/capital-bikeshare\",\r\n" + 
		"            \"id\": \"capital-bikeshare\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Washington, DC\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 38.8967584,\r\n" + 
		"                \"longitude\": -77.03701629999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Capital BikeShare\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_charlotte/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/charlotte\",\r\n" + 
		"            \"id\": \"charlotte\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Charlotte, NC\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 35.22716,\r\n" + 
		"                \"longitude\": -80.83855\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Charlotte B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/saluzzo\",\r\n" + 
		"            \"id\": \"saluzzo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Saluzzo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.6445404,\r\n" + 
		"                \"longitude\": 7.492735499999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Saluzzo\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=51\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_cincyredbike/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/cincy-red-bike\",\r\n" + 
		"            \"id\": \"cincy-red-bike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cincinnati, OH\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.10138,\r\n" + 
		"                \"longitude\": -84.51217\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cincy Red Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/savigliano\",\r\n" + 
		"            \"id\": \"savigliano\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Savigliano\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.6470327,\r\n" + 
		"                \"longitude\": 7.662463499999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Savigliano\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=52\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"NYC Bike Share, LLC\",\r\n" + 
		"                \"Motivate International, Inc.\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.citibikenyc.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/citi-bike-nyc\",\r\n" + 
		"            \"id\": \"citi-bike-nyc\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"New York, NY\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.7143528,\r\n" + 
		"                \"longitude\": -74.00597309999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Citi Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"CycleHop, LLC\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://coast.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/coast-bike-share\",\r\n" + 
		"            \"id\": \"coast-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tampa, FL\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 27.9627193250593,\r\n" + 
		"                \"longitude\": -82.438056400783\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Coast Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/terni\",\r\n" + 
		"            \"id\": \"terni\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Terni\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 42.5636168,\r\n" + 
		"                \"longitude\": 12.6426604\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Terni\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=134\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc.\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.cogobikeshare.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/cogo\",\r\n" + 
		"            \"id\": \"cogo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Columbus, OH\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.983333,\r\n" + 
		"                \"longitude\": -82.983333\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"CoGo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_denver/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/denver\",\r\n" + 
		"            \"id\": \"denver\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Denver, CO\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.72055,\r\n" + 
		"                \"longitude\": -104.95253\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Denver B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc.\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.divvybikes.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/divvy\",\r\n" + 
		"            \"id\": \"divvy\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Chicago, IL\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 41.8781136,\r\n" + 
		"                \"longitude\": -87.6297982\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Divvy\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tirano-in-bici\",\r\n" + 
		"            \"id\": \"tirano-in-bici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tirano\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.216168,\r\n" + 
		"                \"longitude\": 10.1696056\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tirano in Bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=141\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_elpaso/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/elpaso\",\r\n" + 
		"            \"id\": \"elpaso\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"El Paso, TX\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 31.76148,\r\n" + 
		"                \"longitude\": -106.48507\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"El Paso B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_fortworth/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/fortworth\",\r\n" + 
		"            \"id\": \"fortworth\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Fort Worth, TX\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 32.7516,\r\n" + 
		"                \"longitude\": -97.32888\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Fort Worth Bike Sharing\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/udine\",\r\n" + 
		"            \"id\": \"udine\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Udine\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.0710668,\r\n" + 
		"                \"longitude\": 13.2345794\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Udine\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=126\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_greatrides/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/greatrides\",\r\n" + 
		"            \"id\": \"greatrides\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Fargo, ND\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 46.89248,\r\n" + 
		"                \"longitude\": -96.80095\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Great Rides Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_greenbikeslc/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/greenbikeslc\",\r\n" + 
		"            \"id\": \"greenbikeslc\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Salt Lake City\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.76745,\r\n" + 
		"                \"longitude\": -111.88736\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"GREENbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"CycleHop, LLC\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://grid.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/grid-bike-share\",\r\n" + 
		"            \"id\": \"grid-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Phoenix, AZ\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 33.4591031356657,\r\n" + 
		"                \"longitude\": -112.074010667085\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grid Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_heartland/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/omaha\",\r\n" + 
		"            \"id\": \"omaha\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Omaha, NE\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 41.25832,\r\n" + 
		"                \"longitude\": -96.00853\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Heartland B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_houston/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/houston\",\r\n" + 
		"            \"id\": \"houston\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Houston, TX\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 29.75983,\r\n" + 
		"                \"longitude\": -95.36949\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Houston B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc.\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bluebikes.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/blue-bikes\",\r\n" + 
		"            \"id\": \"blue-bikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Boston, MA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 42.3584308,\r\n" + 
		"                \"longitude\": -71.0597732\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Blue Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ustica\",\r\n" + 
		"            \"id\": \"ustica\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ustica\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 38.7031179,\r\n" + 
		"                \"longitude\": 13.1682675\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Ustica\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=138\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"City of Philadelphia\",\r\n" + 
		"                \"Bicycle Transit Systems\",\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_indego/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/indego\",\r\n" + 
		"            \"id\": \"indego\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Philadelphia, PA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.95378,\r\n" + 
		"                \"longitude\": -75.16374\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Indego\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_pacersbikeshare/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/indiana-pacers-bikeshare\",\r\n" + 
		"            \"id\": \"indiana-pacers-bikeshare\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Indianapolis, IN\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.76593,\r\n" + 
		"                \"longitude\": -86.16216\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Indiana Pacers Bikeshare\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"CycleHop, LLC\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://juicebikeshare.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/juice-bike-share\",\r\n" + 
		"            \"id\": \"juice-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Orlando, FL\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 28.536663311743688,\r\n" + 
		"                \"longitude\": -81.37922197580338\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Juice\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bici-co\",\r\n" + 
		"            \"id\": \"bici-co\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Como\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.8080597,\r\n" + 
		"                \"longitude\": 9.0851765\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BICI&CO\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=157\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_kc/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/kansascity\",\r\n" + 
		"            \"id\": \"kansascity\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kansas City, MO\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.0999,\r\n" + 
		"                \"longitude\": -94.5857\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_linkdayton/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/linkdayton\",\r\n" + 
		"            \"id\": \"linkdayton\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dayton, OH\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.75626,\r\n" + 
		"                \"longitude\": -84.21119\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Link\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_madison/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/madison\",\r\n" + 
		"            \"id\": \"madison\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Madison, WI\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 43.07571,\r\n" + 
		"                \"longitude\": -89.38527\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Los Angeles County Metropolitan Transportation Authority (Metro)\",\r\n" + 
		"                \"Bicycle Transit Systems\",\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_lametro/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/metro-bike-share\",\r\n" + 
		"            \"id\": \"metro-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Los Angeles, CA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 34.04855,\r\n" + 
		"                \"longitude\": -118.25905\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Metro Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mountain Rides\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://mrbikeshare.org/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/mountain-rides-bike-share\",\r\n" + 
		"            \"id\": \"mountain-rides-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ketchum / Sun Valley, ID\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 43.5194695168239,\r\n" + 
		"                \"longitude\": -114.317415758737\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mountain Rides Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nice Ride Minnesota\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://api-core.niceridemn.org/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/nice-ride\",\r\n" + 
		"            \"id\": \"nice-ride\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Minneapolis, MN\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 44.983334,\r\n" + 
		"                \"longitude\": -93.26666999999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nice Ride\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/speziainbici\",\r\n" + 
		"            \"id\": \"speziainbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"La Spezia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.1024504,\r\n" + 
		"                \"longitude\": 9.824082599999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Speziainbici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=137\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_sanantonio/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/sanantonio\",\r\n" + 
		"            \"id\": \"sanantonio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Antonio, TX\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 29.43701,\r\n" + 
		"                \"longitude\": -98.48236\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SWell Cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://usf.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/share-a-bull-bikes\",\r\n" + 
		"            \"id\": \"share-a-bull-bikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"University of South Florida, FL\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 28.060548696070995,\r\n" + 
		"                \"longitude\": -82.4076198041439\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Share-a-Bull Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/venezia\",\r\n" + 
		"            \"id\": \"venezia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Venezia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.4408474,\r\n" + 
		"                \"longitude\": 12.3155151\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Venezia\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=93\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://sobilongbeach.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/sobi-long-beach\",\r\n" + 
		"            \"id\": \"sobi-long-beach\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Long Beach, NY\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.5833058203002,\r\n" + 
		"                \"longitude\": -73.6482682794673\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SoBi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BCycle, LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.bcycle.com/bcycle_spartanburg/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/spartanburg\",\r\n" + 
		"            \"id\": \"spartanburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Spartanburg, SC\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 34.94867,\r\n" + 
		"                \"longitude\": -81.93345\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Spartanburg BCycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Topeka Metropolitan Transit Authority\",\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://topekametrobikes.org/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/topeka-metro-bikes\",\r\n" + 
		"            \"id\": \"topeka-metro-bikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Topeka, KS\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 39.0337646098385,\r\n" + 
		"                \"longitude\": -95.7027213202284\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Topeka Metro Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/to-bike\",\r\n" + 
		"            \"id\": \"to-bike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Torino\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.07098200000001,\r\n" + 
		"                \"longitude\": 7.685676\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"[TO]BIKE\",\r\n" + 
		"            \"source\": \"http://www.tobike.it/frmLeStazioni.aspx?ID=22\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"http://ubike.virginia.edu/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/ubike\",\r\n" + 
		"            \"id\": \"ubike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"University of Virginia, VA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 38.0357625021372,\r\n" + 
		"                \"longitude\": -78.5072994363201\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"UBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Motivate International, Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.fordgobike.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/ford-gobike\",\r\n" + 
		"            \"id\": \"ford-gobike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Francisco Bay Area, CA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 37.7141454,\r\n" + 
		"                \"longitude\": -122.25\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bay Wheels\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"CycleHop, LLC\",\r\n" + 
		"                \"Social Bicycles Inc\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://relaybikeshare.socialbicycles.com/opendata/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/relay-atlanta\",\r\n" + 
		"            \"id\": \"relay-atlanta\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Atlanta, GA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 33.7627941119619,\r\n" + 
		"                \"longitude\": -84.38727110624313\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Relay Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tembici\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://rec.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bikerecife\",\r\n" + 
		"            \"id\": \"bikerecife\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Recife\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -8.047129,\r\n" + 
		"                \"longitude\": -34.873437\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeRecife\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tembici\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://saopaulo.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bikesampa\",\r\n" + 
		"            \"id\": \"bikesampa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"São Paulo\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -23.55,\r\n" + 
		"                \"longitude\": -46.6333\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeSampa\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tembici\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://riodejaneiro.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bikerio\",\r\n" + 
		"            \"id\": \"bikerio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rio de Janeiro\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -22.904315,\r\n" + 
		"                \"longitude\": -43.184776\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeRio\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tembici\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://salvador.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bikesalvador\",\r\n" + 
		"            \"id\": \"bikesalvador\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Salvador\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -12.973959,\r\n" + 
		"                \"longitude\": -38.508171\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeSalvador\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tembici\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://poa.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bikepoa\",\r\n" + 
		"            \"id\": \"bikepoa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Porto Alegre\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -30.033079,\r\n" + 
		"                \"longitude\": -51.23654\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikePOA\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"BKT bici publica S.A. de C.V.\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://guad.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/mibici-guadalajara\",\r\n" + 
		"            \"id\": \"mibici-guadalajara\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Guadalajara\",\r\n" + 
		"                \"country\": \"MX\",\r\n" + 
		"                \"latitude\": 20.6737883,\r\n" + 
		"                \"longitude\": -103.3704325\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"MIBICI\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Your Bike\",\r\n" + 
		"                \"Urban Sharing\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.urbansharing.com/edinburghcyclehire.com/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/edinburgh-cycle-hire\",\r\n" + 
		"            \"id\": \"edinburgh-cycle-hire\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"OGL v3 license\",\r\n" + 
		"                \"url\": \"http://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Edinburgh\",\r\n" + 
		"                \"country\": \"UK\",\r\n" + 
		"                \"latitude\": 55.9411885,\r\n" + 
		"                \"longitude\": -3.2753783\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Just Eat Cycles\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"PBSC\",\r\n" + 
		"                \"Alta Bicycle Share, Inc\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.melbourne.8d.com/gbfs/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/melbourne-bike-share\",\r\n" + 
		"            \"id\": \"melbourne-bike-share\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Melbourne\",\r\n" + 
		"                \"country\": \"AU\",\r\n" + 
		"                \"latitude\": -37.814107,\r\n" + 
		"                \"longitude\": 144.96328\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Melbourne Bike Share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://valence.publicbikesystem.net/ube/gbfs/v1/en/\",\r\n" + 
		"            \"href\": \"/v2/networks/libelo\",\r\n" + 
		"            \"id\": \"libelo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Valence\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 44.922726,\r\n" + 
		"                \"longitude\": 4.905634\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Libélo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Tembici\",\r\n" + 
		"                \"PBSC Urban Solutions\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://santiago.publicbikesystem.net/ube/gbfs/v1/\",\r\n" + 
		"            \"href\": \"/v2/networks/bikesantiago\",\r\n" + 
		"            \"id\": \"bikesantiago\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Santiago\",\r\n" + 
		"                \"country\": \"CL\",\r\n" + 
		"                \"latitude\": -33.45,\r\n" + 
		"                \"longitude\": -70.67\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeSantiago\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": null,\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.urbansharing.com/oslobysykkel.no/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/oslo-bysykkel\",\r\n" + 
		"            \"id\": \"oslo-bysykkel\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Oslo\",\r\n" + 
		"                \"country\": \"NO\",\r\n" + 
		"                \"latitude\": 59.913869,\r\n" + 
		"                \"longitude\": 10.752245\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bysykkel\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": null,\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.urbansharing.com/bergenbysykkel.no/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/bergen-bysykkel\",\r\n" + 
		"            \"id\": \"bergen-bysykkel\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bergen\",\r\n" + 
		"                \"country\": \"NO\",\r\n" + 
		"                \"latitude\": 60.391263,\r\n" + 
		"                \"longitude\": 5.322054\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bysykkel\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": null,\r\n" + 
		"            \"gbfs_href\": \"https://gbfs.urbansharing.com/trondheimbysykkel.no/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/trondheim-bysykkel\",\r\n" + 
		"            \"id\": \"trondheim-bysykkel\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Trondheim\",\r\n" + 
		"                \"country\": \"NO\",\r\n" + 
		"                \"latitude\": 63.4307238,\r\n" + 
		"                \"longitude\": 10.3936781\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bysykkel\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Keolis\",\r\n" + 
		"                \"Rennes Metropole\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/le-velo-star\",\r\n" + 
		"            \"id\": \"le-velo-star\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rennes\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 48.114167,\r\n" + 
		"                \"longitude\": -1.680833\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"LE vélo Star\",\r\n" + 
		"            \"source\": \"https://data.explore.star.fr/explore/dataset/vls-stations-etat-tr/\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Keolis Bordeaux Métropole\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/v3-bordeaux\",\r\n" + 
		"            \"id\": \"v3-bordeaux\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bordeaux\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 44.837789,\r\n" + 
		"                \"longitude\": -0.57918\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"V³\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Keolis\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vlille\",\r\n" + 
		"            \"id\": \"vlille\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lille\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 50.62925,\r\n" + 
		"                \"longitude\": 3.057256\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"V'lille\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Keolis\",\r\n" + 
		"                \"STAP\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/idecycle\",\r\n" + 
		"            \"id\": \"idecycle\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pau\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 43.2951,\r\n" + 
		"                \"longitude\": -0.370797\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"IDECycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Labici Bicicletas Públicas SL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicialtea\",\r\n" + 
		"            \"id\": \"bicialtea\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Altea\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.6029075,\r\n" + 
		"                \"longitude\": -0.0450666\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicialtea\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Labici Bicicletas Públicas SL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicidorm\",\r\n" + 
		"            \"id\": \"bicidorm\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Benidorm\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.5410566,\r\n" + 
		"                \"longitude\": -0.1224937\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicidorm\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Labici Bicicletas Públicas SL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/saforbici\",\r\n" + 
		"            \"id\": \"saforbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gandía\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 38.968032,\r\n" + 
		"                \"longitude\": -0.1844671\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SaforBici\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ciclopi\",\r\n" + 
		"            \"id\": \"ciclopi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pisa\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.7228386,\r\n" + 
		"                \"longitude\": 10.4016888\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Ciclopi\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=144\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Labici Bicicletas Públicas SL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/gbici\",\r\n" + 
		"            \"id\": \"gbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Getafe\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 40.3082504,\r\n" + 
		"                \"longitude\": -3.7323934\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Gbici\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Labici Bicicletas Públicas SL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/muybici\",\r\n" + 
		"            \"id\": \"muybici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Murcia\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.9922399,\r\n" + 
		"                \"longitude\": -1.1306544\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"MuyBici\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Labici Bicicletas Públicas SL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ponfemobi\",\r\n" + 
		"            \"id\": \"ponfemobi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ponferrada\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.5499958,\r\n" + 
		"                \"longitude\": -6.598259000000001\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"PonfeMobi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Labici Bicicletas Públicas SL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vaibike\",\r\n" + 
		"            \"id\": \"vaibike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vilagarcía de Arousa\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.5999265,\r\n" + 
		"                \"longitude\": -8.7885744\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VaiBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cagliari\",\r\n" + 
		"            \"id\": \"cagliari\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cagliari\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.220817,\r\n" + 
		"                \"longitude\": 9.121399\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cagliari\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=177\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Buenos Aires Ciudad\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://apitransporte.buenosaires.gob.ar/ecobici/gbfs/\",\r\n" + 
		"            \"href\": \"/v2/networks/ecobici-buenos-aires\",\r\n" + 
		"            \"id\": \"ecobici-buenos-aires\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Data Commons Open Database License 1.0 (ODbL)\",\r\n" + 
		"                \"url\": \"https://opendatacommons.org/licenses/odbl/\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Buenos Aires\",\r\n" + 
		"                \"country\": \"AR\",\r\n" + 
		"                \"latitude\": -34.630665,\r\n" + 
		"                \"longitude\": -58.41156\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Ecobici\",\r\n" + 
		"            \"source\": \"https://www.buenosaires.gob.ar/desarrollourbano/transporte/apitransporte\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"EMEL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/gira\",\r\n" + 
		"            \"id\": \"gira\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lisbon\",\r\n" + 
		"                \"country\": \"PT\",\r\n" + 
		"                \"latitude\": 38.724954,\r\n" + 
		"                \"longitude\": -9.149334\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Gira\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/gimme-bike\",\r\n" + 
		"            \"id\": \"gimme-bike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Varese\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.8183902,\r\n" + 
		"                \"longitude\": 8.823913\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Gimme Bike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=50\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cyclic\",\r\n" + 
		"            \"id\": \"cyclic\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rouen\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 49.44323199999999,\r\n" + 
		"                \"longitude\": 1.099971\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"cy'clic\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velo\",\r\n" + 
		"            \"id\": \"velo\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Toulouse\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 43.604652,\r\n" + 
		"                \"longitude\": 1.444209\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Vélô\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/veloh\",\r\n" + 
		"            \"id\": \"veloh\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Luxembourg\",\r\n" + 
		"                \"country\": \"LU\",\r\n" + 
		"                \"latitude\": 49.6301025,\r\n" + 
		"                \"longitude\": 6.1520185\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Veloh\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/valenbisi\",\r\n" + 
		"            \"id\": \"valenbisi\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Valencia\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 39.4699075,\r\n" + 
		"                \"longitude\": -0.3762881\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Valenbisi\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sellero\",\r\n" + 
		"            \"id\": \"sellero\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sellero\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.06304765446406,\r\n" + 
		"                \"longitude\": 10.353434085845947\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Sellero\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=85\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/goeteborg\",\r\n" + 
		"            \"id\": \"goeteborg\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Göteborg\",\r\n" + 
		"                \"country\": \"SE\",\r\n" + 
		"                \"latitude\": 57.70887,\r\n" + 
		"                \"longitude\": 11.97456\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Styr & Ställ\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lundahoj\",\r\n" + 
		"            \"id\": \"lundahoj\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lund\",\r\n" + 
		"                \"country\": \"SE\",\r\n" + 
		"                \"latitude\": 55.7046601,\r\n" + 
		"                \"longitude\": 13.1910073\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Lundahoj\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ugento\",\r\n" + 
		"            \"id\": \"ugento\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ugento\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.9273518,\r\n" + 
		"                \"longitude\": 18.1582962\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Ugento\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=103\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tusbic\",\r\n" + 
		"            \"id\": \"tusbic\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Santander\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 43.46230569999999,\r\n" + 
		"                \"longitude\": -3.8099803\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tusbic\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velam\",\r\n" + 
		"            \"id\": \"velam\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Amiens\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 49.894067,\r\n" + 
		"                \"longitude\": 2.295753\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velam\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bysykkel-lillestrom\",\r\n" + 
		"            \"id\": \"bysykkel-lillestrom\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lillestrøm\",\r\n" + 
		"                \"country\": \"NO\",\r\n" + 
		"                \"latitude\": 59.9559696,\r\n" + 
		"                \"longitude\": 11.0503785\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bysykkel\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velocite-mulhouse\",\r\n" + 
		"            \"id\": \"velocite-mulhouse\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mulhouse\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 47.750839,\r\n" + 
		"                \"longitude\": 7.335888\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VéloCité\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/prata-camportaccio\",\r\n" + 
		"            \"id\": \"prata-camportaccio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Prata Camportaccio\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.3042146,\r\n" + 
		"                \"longitude\": 9.3964914\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Prata Camportaccio\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=108\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velov\",\r\n" + 
		"            \"id\": \"velov\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lyon\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 45.764043,\r\n" + 
		"                \"longitude\": 4.835659\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Vélo'V\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicikelj\",\r\n" + 
		"            \"id\": \"bicikelj\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ljubljana\",\r\n" + 
		"                \"country\": \"SI\",\r\n" + 
		"                \"latitude\": 46.05645089999999,\r\n" + 
		"                \"longitude\": 14.5080702\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicikelj\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/civitavecchia\",\r\n" + 
		"            \"id\": \"civitavecchia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Civitavecchia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 42.0937524,\r\n" + 
		"                \"longitude\": 11.7922462\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Civitavecchia\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=127\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sevici\",\r\n" + 
		"            \"id\": \"sevici\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sevilla\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 37.3880961,\r\n" + 
		"                \"longitude\": -5.9823299\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Sevici\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/longanoinbici\",\r\n" + 
		"            \"id\": \"longanoinbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Barcellona Pozzo di Gotto\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 38.149812517944284,\r\n" + 
		"                \"longitude\": 15.212116241455078\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"LonganoinBici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=140\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/li-bia-velo\",\r\n" + 
		"            \"id\": \"li-bia-velo\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Namur\",\r\n" + 
		"                \"country\": \"BE\",\r\n" + 
		"                \"latitude\": 50.465328,\r\n" + 
		"                \"longitude\": 4.867665\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Li bia velo\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velostanlib\",\r\n" + 
		"            \"id\": \"velostanlib\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nancy\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 48.692054,\r\n" + 
		"                \"longitude\": 6.184417\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"vélOstan'lib\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cristolib\",\r\n" + 
		"            \"id\": \"cristolib\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Créteil\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 48.790367,\r\n" + 
		"                \"longitude\": 2.455572\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cristolib\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/villo\",\r\n" + 
		"            \"id\": \"villo\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bruxelles\",\r\n" + 
		"                \"country\": \"BE\",\r\n" + 
		"                \"latitude\": 50.8503396,\r\n" + 
		"                \"longitude\": 4.3517103\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"villo\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cassano-d-adda\",\r\n" + 
		"            \"id\": \"cassano-d-adda\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cassano d'Adda\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.5309616,\r\n" + 
		"                \"longitude\": 9.5155813\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cassano d'Adda\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=143\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velo2\",\r\n" + 
		"            \"id\": \"velo2\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cergy\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 49.03561699999999,\r\n" + 
		"                \"longitude\": 2.060325\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velo2\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vilnius-cyclocity\",\r\n" + 
		"            \"id\": \"vilnius-cyclocity\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vilnius\",\r\n" + 
		"                \"country\": \"LT\",\r\n" + 
		"                \"latitude\": 54.6871555,\r\n" + 
		"                \"longitude\": 25.2796514\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cyclocity\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/toyama-cyclocity\",\r\n" + 
		"            \"id\": \"toyama-cyclocity\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"富山市\",\r\n" + 
		"                \"country\": \"JP\",\r\n" + 
		"                \"latitude\": 36.6959518,\r\n" + 
		"                \"longitude\": 137.2136768\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"cyclocity\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velik\",\r\n" + 
		"            \"id\": \"velik\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Казань\",\r\n" + 
		"                \"country\": \"RU\",\r\n" + 
		"                \"latitude\": 55.7949414,\r\n" + 
		"                \"longitude\": 49.1050445\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Veli'k\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bianzone-in-bici\",\r\n" + 
		"            \"id\": \"bianzone-in-bici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bianzone\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.188197,\r\n" + 
		"                \"longitude\": 10.109354\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bianzone in Bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=147\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/le-velo\",\r\n" + 
		"            \"id\": \"le-velo\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Marseille\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 43.296482,\r\n" + 
		"                \"longitude\": 5.36978\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Le vélo\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicloo\",\r\n" + 
		"            \"id\": \"bicloo\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nantes\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 47.218371,\r\n" + 
		"                \"longitude\": -1.553621\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicloo\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velocite-besancon\",\r\n" + 
		"            \"id\": \"velocite-besancon\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Besançon\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 47.237829,\r\n" + 
		"                \"longitude\": 6.024053899999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VéloCité\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rietinbici\",\r\n" + 
		"            \"id\": \"rietinbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rieti\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 42.40262397383167,\r\n" + 
		"                \"longitude\": 12.86099910736084\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rietinbici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=158\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/dublinbikes\",\r\n" + 
		"            \"id\": \"dublinbikes\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dublin\",\r\n" + 
		"                \"country\": \"IE\",\r\n" + 
		"                \"latitude\": 53.3498053,\r\n" + 
		"                \"longitude\": -6.2603097\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"dublinbikes\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"JCDecaux\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/citycycle\",\r\n" + 
		"            \"id\": \"citycycle\",\r\n" + 
		"            \"license\": {\r\n" + 
		"                \"name\": \"Open Licence\",\r\n" + 
		"                \"url\": \"https://developer.jcdecaux.com/#/opendata/licence\"\r\n" + 
		"            },\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Brisbane\",\r\n" + 
		"                \"country\": \"AU\",\r\n" + 
		"                \"latitude\": -27.4710107,\r\n" + 
		"                \"longitude\": 153.0234489\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"CityCycle\",\r\n" + 
		"            \"source\": \"https://developer.jcdecaux.com\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": null,\r\n" + 
		"            \"href\": \"/v2/networks/bicipalma\",\r\n" + 
		"            \"id\": \"bicipalma\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Palma\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 39.57119,\r\n" + 
		"                \"longitude\": 2.646634\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicipalma\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Cyacle Bicycle Rental LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/adcb-bikeshare\",\r\n" + 
		"            \"id\": \"adcb-bikeshare\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Abu Dhabi\",\r\n" + 
		"                \"country\": \"AE\",\r\n" + 
		"                \"latitude\": 24.450278,\r\n" + 
		"                \"longitude\": 54.39\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ADCB Bikeshare\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/castellucchio\",\r\n" + 
		"            \"id\": \"castellucchio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Castellucchio\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.15047821582959,\r\n" + 
		"                \"longitude\": 10.651202201843262\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Castellucchio\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=161\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Veolia\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/dkvelo\",\r\n" + 
		"            \"id\": \"dkvelo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dunkerque\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 51.0383,\r\n" + 
		"                \"longitude\": 2.3775\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"DK'Vélo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Veolia\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velobleu\",\r\n" + 
		"            \"id\": \"velobleu\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nice\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 43.695949,\r\n" + 
		"                \"longitude\": 7.271413\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Vélo Bleu\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/notoinbici\",\r\n" + 
		"            \"id\": \"notoinbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Noto\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 36.889437754839854,\r\n" + 
		"                \"longitude\": 15.074658393859863\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"NotoinBici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=162\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/enna\",\r\n" + 
		"            \"id\": \"enna\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Enna\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 37.56342572664775,\r\n" + 
		"                \"longitude\": 14.27973747253418\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Enna\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=163\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/pordenone\",\r\n" + 
		"            \"id\": \"pordenone\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pordenone\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.94790101663391,\r\n" + 
		"                \"longitude\": 12.674491020251475\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Pordenone\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=164\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Veolia\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velocea\",\r\n" + 
		"            \"id\": \"velocea\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vannes\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 47.6559,\r\n" + 
		"                \"longitude\": -2.7603\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Vélocéa\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Veolia\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vel-in\",\r\n" + 
		"            \"id\": \"vel-in\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Calais\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 50.95,\r\n" + 
		"                \"longitude\": 1.85\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Vél'in\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/carbonia\",\r\n" + 
		"            \"id\": \"carbonia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Carbonia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.167222,\r\n" + 
		"                \"longitude\": 8.522222\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Carbonia\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=173\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Municipiul Cluj-Napoca\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/clujbike\",\r\n" + 
		"            \"id\": \"clujbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cluj-Napoca\",\r\n" + 
		"                \"country\": \"RO\",\r\n" + 
		"                \"latitude\": 46.775,\r\n" + 
		"                \"longitude\": 23.5975\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cluj Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/mobike\",\r\n" + 
		"            \"id\": \"mobike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Genova\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.40430089372731,\r\n" + 
		"                \"longitude\": 8.92908986230462\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"MoBike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=175\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Prefeiture de Sorocaba\",\r\n" + 
		"                \"Urbes\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/integrabike\",\r\n" + 
		"            \"id\": \"integrabike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sorocaba\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -23.5015,\r\n" + 
		"                \"longitude\": -47.4526\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Integrabike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/scegli-in-bici\",\r\n" + 
		"            \"id\": \"scegli-in-bici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cremona\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.134914104864116,\r\n" + 
		"                \"longitude\": 10.0222648619018\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Scegli in Bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=178\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Associação dos Amigos da Riviera de São Lourenço\",\r\n" + 
		"                \"Sobloco\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rivibike\",\r\n" + 
		"            \"id\": \"rivibike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"São Lourenço\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -22.1124,\r\n" + 
		"                \"longitude\": -45.028\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"RiviBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/e-motion-trento\",\r\n" + 
		"            \"id\": \"e-motion-trento\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Trento\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.06643205823519,\r\n" + 
		"                \"longitude\": 11.122145390351879\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"e.motion\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=187\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Duke Energy Brasil\",\r\n" + 
		"                \"Governo de Ipaussu\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/dukebike\",\r\n" + 
		"            \"id\": \"dukebike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ipaússu\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -23.0553,\r\n" + 
		"                \"longitude\": -49.6237\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"DukeBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/e-motion-pergine-valsugana\",\r\n" + 
		"            \"id\": \"e-motion-pergine-valsugana\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pergine Valsugana\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.06050419001399,\r\n" + 
		"                \"longitude\": 11.239041694195503\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"e.motion\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=188\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Barcelona de Serveis Municipals, S.A. (BSM)\",\r\n" + 
		"                \"CESPA\",\r\n" + 
		"                \"PBSC\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicing\",\r\n" + 
		"            \"id\": \"bicing\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Barcelona\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 41.3850639,\r\n" + 
		"                \"longitude\": 2.1734035\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicing\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Baksi Bike Sharing System\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/baksi-antalya\",\r\n" + 
		"            \"id\": \"baksi-antalya\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Antalya\",\r\n" + 
		"                \"country\": \"TR\",\r\n" + 
		"                \"latitude\": 36.862048,\r\n" + 
		"                \"longitude\": 30.638866\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Baksi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Baksi Bike Sharing System\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/baksi-bisim\",\r\n" + 
		"            \"id\": \"baksi-bisim\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Izmir\",\r\n" + 
		"                \"country\": \"TR\",\r\n" + 
		"                \"latitude\": 38.4134047464,\r\n" + 
		"                \"longitude\": 27.0325753524\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Baksi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/e-motion-rovereto\",\r\n" + 
		"            \"id\": \"e-motion-rovereto\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rovereto\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.88710661061543,\r\n" + 
		"                \"longitude\": 11.042242751867644\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"e.motion\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=189\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Baksi Bike Sharing System\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/baksi-istanbul\",\r\n" + 
		"            \"id\": \"baksi-istanbul\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Istanbul\",\r\n" + 
		"                \"country\": \"TR\",\r\n" + 
		"                \"latitude\": 40.9696887925,\r\n" + 
		"                \"longitude\": 29.0475373717\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Isbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Baksi Bike Sharing System\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/baksi-kobis\",\r\n" + 
		"            \"id\": \"baksi-kobis\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kocaeli\",\r\n" + 
		"                \"country\": \"TR\",\r\n" + 
		"                \"latitude\": 40.7674733342,\r\n" + 
		"                \"longitude\": 29.9755885985\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Baksi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Gewista Werbegesellschaft m.b.H\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/citybike-wien\",\r\n" + 
		"            \"id\": \"citybike-wien\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wien\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.2081743,\r\n" + 
		"                \"longitude\": 16.3738189\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Citybike Wien\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Helsinki City Transport\",\r\n" + 
		"                \"Helsinki Regional Transport\",\r\n" + 
		"                \"CityBikeFinland\",\r\n" + 
		"                \"Smoove SAS\",\r\n" + 
		"                \"Moventia\",\r\n" + 
		"                \"Alepa\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/citybikes-helsinki\",\r\n" + 
		"            \"id\": \"citybikes-helsinki\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Helsinki\",\r\n" + 
		"                \"country\": \"FI\",\r\n" + 
		"                \"latitude\": 60.16985569999999,\r\n" + 
		"                \"longitude\": 24.938379\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"City bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/monopoli-bike\",\r\n" + 
		"            \"id\": \"monopoli-bike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Monopoli\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.94519109440738,\r\n" + 
		"                \"longitude\": 17.311687995336918\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Monopoli BIKE\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=191\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Turku Region Traffic Föli\",\r\n" + 
		"                \"Nextbike Polska\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/foli\",\r\n" + 
		"            \"id\": \"foli\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Turku\",\r\n" + 
		"                \"country\": \"FI\",\r\n" + 
		"                \"latitude\": 60.4506,\r\n" + 
		"                \"longitude\": 22.2666\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Föli-fillari\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ITCL\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicileon\",\r\n" + 
		"            \"id\": \"bicileon\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"León\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.5987263,\r\n" + 
		"                \"longitude\": -5.5670959\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicileon\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicimia\",\r\n" + 
		"            \"id\": \"bicimia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Brescia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.5398382,\r\n" + 
		"                \"longitude\": 10.2229562\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BiciMia\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"FSM Ground Services Ltd.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/telofun\",\r\n" + 
		"            \"id\": \"telofun\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tel Aviv-Yaffo, Giv'atayim, Ramat-Gan\",\r\n" + 
		"                \"country\": \"IL\",\r\n" + 
		"                \"latitude\": 32.087053,\r\n" + 
		"                \"longitude\": 34.789776\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tel-O-Fun\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/andria\",\r\n" + 
		"            \"id\": \"andria\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Andria\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 41.224346932834,\r\n" + 
		"                \"longitude\": 16.296983922753956\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Andria in Bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=192\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Open Source Bike Share\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/whitebikes\",\r\n" + 
		"            \"id\": \"whitebikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bratislava\",\r\n" + 
		"                \"country\": \"SK\",\r\n" + 
		"                \"latitude\": 48.149424,\r\n" + 
		"                \"longitude\": 17.113922\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"WhiteBikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Dopravný podnik Bratislava\",\r\n" + 
		"                \"Bratislavská integrovaná doprava, a.s.\",\r\n" + 
		"                \"Hlavné mesto SR Bratislava\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/slovnaft-bajk\",\r\n" + 
		"            \"id\": \"slovnaft-bajk\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bratislava\",\r\n" + 
		"                \"country\": \"SK\",\r\n" + 
		"                \"latitude\": 48.1356952,\r\n" + 
		"                \"longitude\": 16.9758332\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Slovnaft BAjk\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Open Source Bike Share\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cykl\",\r\n" + 
		"            \"id\": \"cykl\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wageningen\",\r\n" + 
		"                \"country\": \"NL\",\r\n" + 
		"                \"latitude\": 51.974,\r\n" + 
		"                \"longitude\": 5.6671\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Cykl\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Open Source Bike Share\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicyklezadobreskutky\",\r\n" + 
		"            \"id\": \"bicyklezadobreskutky\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Prešov\",\r\n" + 
		"                \"country\": \"SK\",\r\n" + 
		"                \"latitude\": 48.996275,\r\n" + 
		"                \"longitude\": 21.234341\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicykle za dobré skutky\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Social Bicycles Inc.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/socialbicycles-wavelo\",\r\n" + 
		"            \"id\": \"socialbicycles-wavelo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kraków\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.06143,\r\n" + 
		"                \"longitude\": 19.93658\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Wavelo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicinquartucciu\",\r\n" + 
		"            \"id\": \"bicinquartucciu\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Quartucciu\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.25043149806156,\r\n" + 
		"                \"longitude\": 9.179296426489255\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BicinQuartucciu\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=193\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mainzer Verkehrsgesellschaft mbH (MVG)\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/mvgmeinrad\",\r\n" + 
		"            \"id\": \"mvgmeinrad\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mainz\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.992862,\r\n" + 
		"                \"longitude\": 8.247253\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"MVGmeinrad\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Sistema de Bicicletas Públicas del Valle de Aburrá\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/encicla\",\r\n" + 
		"            \"id\": \"encicla\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Medellin\",\r\n" + 
		"                \"country\": \"CO\",\r\n" + 
		"                \"latitude\": 6.254942,\r\n" + 
		"                \"longitude\": -75.567982\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"EnCicla\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/olbia-bike\",\r\n" + 
		"            \"id\": \"olbia-bike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Olbia\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.9240543,\r\n" + 
		"                \"longitude\": 9.4994397\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Olbia Bike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=194\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Vanncouver Bike Share Inc\",\r\n" + 
		"                \"CycleHop LLC\",\r\n" + 
		"                \"City of Vancouver\",\r\n" + 
		"                \"Smoove SAS\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/mobibikes\",\r\n" + 
		"            \"id\": \"mobibikes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vancouver\",\r\n" + 
		"                \"country\": \"CA\",\r\n" + 
		"                \"latitude\": 49.2827,\r\n" + 
		"                \"longitude\": -123.1207\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mobi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/savona\",\r\n" + 
		"            \"id\": \"savona\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Savona\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.29516444397244,\r\n" + 
		"                \"longitude\": 8.463126708984431\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Savona\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=195\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Smoove\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/c-velo\",\r\n" + 
		"            \"id\": \"c-velo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Clermont-Ferrand\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 45.770958,\r\n" + 
		"                \"longitude\": 3.073871\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"C.Vélo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Smoove\"\r\n" + 
		"            ],\r\n" + 
		"            \"gbfs_href\": \"https://saint-etienne-gbfs.klervi.net/gbfs/en/gbfs.json\",\r\n" + 
		"            \"href\": \"/v2/networks/velivert\",\r\n" + 
		"            \"id\": \"velivert\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Saint-Étienne\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 45.396667,\r\n" + 
		"                \"longitude\": 4.290833\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VéliVert\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/brindisi\",\r\n" + 
		"            \"id\": \"brindisi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Brindisi\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.637580319936106,\r\n" + 
		"                \"longitude\": 17.940774547082572\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BrindisiByBike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=197\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Smoove\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velopop\",\r\n" + 
		"            \"id\": \"velopop\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Avignon\",\r\n" + 
		"                \"country\": \"FR\",\r\n" + 
		"                \"latitude\": 43.943689,\r\n" + 
		"                \"longitude\": 4.805833\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Vélopop\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Smoove\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/batumvelo\",\r\n" + 
		"            \"id\": \"batumvelo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Batumi\",\r\n" + 
		"                \"country\": \"GE\",\r\n" + 
		"                \"latitude\": 41.660906,\r\n" + 
		"                \"longitude\": 41.678835\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Batumvelo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tradate\",\r\n" + 
		"            \"id\": \"tradate\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tradate\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.70938576720161,\r\n" + 
		"                \"longitude\": 8.915993391601548\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tradate\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=198\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikebh\",\r\n" + 
		"            \"id\": \"bikebh\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Belo Horizonte\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -19.920793,\r\n" + 
		"                \"longitude\": -43.922165\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeBH\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikepetrolina\",\r\n" + 
		"            \"id\": \"bikepetrolina\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Petrolina\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -9.389049,\r\n" + 
		"                \"longitude\": -40.502751\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikePetrolina\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jesinbici\",\r\n" + 
		"            \"id\": \"jesinbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Jesi\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.522601,\r\n" + 
		"                \"longitude\": 13.244448\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JesinBici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=236\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nbici\",\r\n" + 
		"            \"id\": \"nbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pamplona\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 42.8116631,\r\n" + 
		"                \"longitude\": -1.6482653\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"nbici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=230\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikebrasilia\",\r\n" + 
		"            \"id\": \"bikebrasilia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Brasília\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -15.795115,\r\n" + 
		"                \"longitude\": -47.887424\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeBrasilia\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/debikegoiania\",\r\n" + 
		"            \"id\": \"debikegoiania\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Goiânia\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -16.670492,\r\n" + 
		"                \"longitude\": -49.259535\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"GynDebike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/treviso\",\r\n" + 
		"            \"id\": \"treviso\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Treviso\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.6669011,\r\n" + 
		"                \"longitude\": 12.243039\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Treviso\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=179\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicicletar\",\r\n" + 
		"            \"id\": \"bicicletar\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Fortaleza\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -3.7321944,\r\n" + 
		"                \"longitude\": -38.510347\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicicletar\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/cajubike\",\r\n" + 
		"            \"id\": \"cajubike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Aracajú\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -10.987263,\r\n" + 
		"                \"longitude\": -37.051898\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"CajuBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikebelem\",\r\n" + 
		"            \"id\": \"bikebelem\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Belém\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -1.4600794,\r\n" + 
		"                \"longitude\": -48.490865\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bike Belém\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sondrio\",\r\n" + 
		"            \"id\": \"sondrio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sondrio\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.1698583,\r\n" + 
		"                \"longitude\": 9.8787674\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Sondrio\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=213\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Grupo Serttel LTDA\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikesantos\",\r\n" + 
		"            \"id\": \"bikesantos\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Santos\",\r\n" + 
		"                \"country\": \"BR\",\r\n" + 
		"                \"latitude\": -23.954052,\r\n" + 
		"                \"longitude\": -46.333345\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeSantos\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vercelli\",\r\n" + 
		"            \"id\": \"vercelli\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vercelli\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.32022720000001,\r\n" + 
		"                \"longitude\": 8.418573499999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Vercelli\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=235\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/portofino-park-and-bike\",\r\n" + 
		"            \"id\": \"portofino-park-and-bike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Santa Margherita Ligure - Portofino - Camogli\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.335084,\r\n" + 
		"                \"longitude\": 9.211264\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Portofino Park and Bike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=128\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Mobilicidade Tecnologia LTD\",\r\n" + 
		"                \"Municipalidad de Rosario\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/mibicitubici\",\r\n" + 
		"            \"id\": \"mibicitubici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rosario\",\r\n" + 
		"                \"country\": \"AR\",\r\n" + 
		"                \"latitude\": -32.95,\r\n" + 
		"                \"longitude\": -60.65\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi bici tu bici\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"DecoBike LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/decobike-miami-beach\",\r\n" + 
		"            \"id\": \"decobike-miami-beach\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Miami Beach, FL\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 25.790654,\r\n" + 
		"                \"longitude\": -80.1300455\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Citi Bike Miami\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"DecoBike LLC\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/decobike-san-diego\",\r\n" + 
		"            \"id\": \"decobike-san-diego\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Diego, CA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 32.715738,\r\n" + 
		"                \"longitude\": -117.1610838\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Decobike San Diego\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/meglio-in-bici\",\r\n" + 
		"            \"id\": \"meglio-in-bici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cernusco sul Naviglio - Pioltello - Carugate\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.520541,\r\n" + 
		"                \"longitude\": 9.341984\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Meglio in Bici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=121\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Trek Bicycle Corporation\",\r\n" + 
		"                \"Humana\",\r\n" + 
		"                \"Crispin Porter + Bogusky\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/battlecreek\",\r\n" + 
		"            \"id\": \"battlecreek\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Battle Creek, MI\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 42.32423,\r\n" + 
		"                \"longitude\": -85.18833\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Battle Creek B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Trek Bicycle Corporation\",\r\n" + 
		"                \"Humana\",\r\n" + 
		"                \"Crispin Porter + Bogusky\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/desmoines\",\r\n" + 
		"            \"id\": \"desmoines\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Des Moines, IA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 41.6005448,\r\n" + 
		"                \"longitude\": -93.6091064\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Des Moines B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ossola\",\r\n" + 
		"            \"id\": \"ossola\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Santa Maria Maggiore - Malesco - Villette\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.127196,\r\n" + 
		"                \"longitude\": 8.499169\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Comunità Montana Valli dell'Ossola\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=152\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Trek Bicycle Corporation\",\r\n" + 
		"                \"Humana\",\r\n" + 
		"                \"Crispin Porter + Bogusky\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/greenville\",\r\n" + 
		"            \"id\": \"greenville\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Greenville, SC\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 34.85261759999999,\r\n" + 
		"                \"longitude\": -82.3940104\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Greenville B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-mezzolombardo\",\r\n" + 
		"            \"id\": \"bicincitta-mezzolombardo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mezzolombardo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.21400260000001,\r\n" + 
		"                \"longitude\": 11.0967867\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=228\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Trek Bicycle Corporation\",\r\n" + 
		"                \"Humana\",\r\n" + 
		"                \"Crispin Porter + Bogusky\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nashville\",\r\n" + 
		"            \"id\": \"nashville\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nashville, TN\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 36.1666667,\r\n" + 
		"                \"longitude\": -86.7833333\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nashville B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-lausanne-campus-morges\",\r\n" + 
		"            \"id\": \"bicincitta-lausanne-campus-morges\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lausanne - Morges - Campus\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.5196535,\r\n" + 
		"                \"longitude\": 6.6322734\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=123\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Trek Bicycle Corporation\",\r\n" + 
		"                \"Humana\",\r\n" + 
		"                \"Crispin Porter + Bogusky\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/columbia-county\",\r\n" + 
		"            \"id\": \"columbia-county\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Evans, GA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 33.5375,\r\n" + 
		"                \"longitude\": -82.127778\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Columbia County B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-scafati\",\r\n" + 
		"            \"id\": \"bicincitta-scafati\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Scafati\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.7620174,\r\n" + 
		"                \"longitude\": 14.5363969\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=106\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Trek Bicycle Corporation\",\r\n" + 
		"                \"Humana\",\r\n" + 
		"                \"Crispin Porter + Bogusky\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/catbike\",\r\n" + 
		"            \"id\": \"catbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Savannah, GA\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 32.016667,\r\n" + 
		"                \"longitude\": -81.116667\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"CAT Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-livorno\",\r\n" + 
		"            \"id\": \"bicincitta-livorno\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Livorno\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.548473,\r\n" + 
		"                \"longitude\": 10.3105674\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=226\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Trek Bicycle Corporation\",\r\n" + 
		"                \"Humana\",\r\n" + 
		"                \"Crispin Porter + Bogusky\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rapid-city\",\r\n" + 
		"            \"id\": \"rapid-city\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rapid City, SD\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 44.076,\r\n" + 
		"                \"longitude\": -103.228\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rapid City B-cycle\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-valais-central\",\r\n" + 
		"            \"id\": \"bicincitta-valais-central\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sion\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.2331221,\r\n" + 
		"                \"longitude\": 7.360625999999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=89\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-forli\",\r\n" + 
		"            \"id\": \"bicincitta-forli\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Forlì\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.2227398,\r\n" + 
		"                \"longitude\": 12.0407312\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=119\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-rivarolo-canavese\",\r\n" + 
		"            \"id\": \"bicincitta-rivarolo-canavese\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rivarolo Canavese\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.306633,\r\n" + 
		"                \"longitude\": 7.723242\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=227\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-monserrato\",\r\n" + 
		"            \"id\": \"bicincitta-monserrato\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Monserrato\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.2560191,\r\n" + 
		"                \"longitude\": 9.1453579\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=220\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-mezzocorona\",\r\n" + 
		"            \"id\": \"bicincitta-mezzocorona\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mezzocorona\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.2339047,\r\n" + 
		"                \"longitude\": 11.1277461\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=229\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-san-lazzaro-di-savena\",\r\n" + 
		"            \"id\": \"bicincitta-san-lazzaro-di-savena\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Lazzaro di Savena\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.4702725,\r\n" + 
		"                \"longitude\": 11.409399\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=100\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-san-teodoro\",\r\n" + 
		"            \"id\": \"bicincitta-san-teodoro\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Teodoro\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.7722837,\r\n" + 
		"                \"longitude\": 9.6695458\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=225\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-parco-molentargius-saline\",\r\n" + 
		"            \"id\": \"bicincitta-parco-molentargius-saline\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Parco Naturale Molentargius - Saline\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.2052545,\r\n" + 
		"                \"longitude\": 9.146761099999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=151\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/parkinbici\",\r\n" + 
		"            \"id\": \"parkinbici\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Parco Nazionale del Gargano\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 41.7817081,\r\n" + 
		"                \"longitude\": 15.8516421\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Parkinbici\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=105\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-gallipoli\",\r\n" + 
		"            \"id\": \"bicincitta-gallipoli\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gallipoli\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.0558554,\r\n" + 
		"                \"longitude\": 17.9925085\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=109\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-castel-guelfo-the-style-outlets\",\r\n" + 
		"            \"id\": \"bicincitta-castel-guelfo-the-style-outlets\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Castel Guelfo di Bologna\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.4328527,\r\n" + 
		"                \"longitude\": 11.6750857\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=233\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-san-michele-alladige\",\r\n" + 
		"            \"id\": \"bicincitta-san-michele-alladige\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Michele All'adige\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.1878653,\r\n" + 
		"                \"longitude\": 11.1330423\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=231\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-agglo-fribourg\",\r\n" + 
		"            \"id\": \"bicincitta-agglo-fribourg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Fribourg\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.8064773,\r\n" + 
		"                \"longitude\": 7.161971899999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=33\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-modena\",\r\n" + 
		"            \"id\": \"bicincitta-modena\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Modena\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.647128,\r\n" + 
		"                \"longitude\": 10.9252269\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=180\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-brancaleone\",\r\n" + 
		"            \"id\": \"bicincitta-brancaleone\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Brancaleone\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 37.9679084,\r\n" + 
		"                \"longitude\": 16.0757749\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=104\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-bulle\",\r\n" + 
		"            \"id\": \"bicincitta-bulle\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bulle\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.6154512,\r\n" + 
		"                \"longitude\": 7.057726799999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=34\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-riviera\",\r\n" + 
		"            \"id\": \"bicincitta-riviera\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Distretto della Riviera-Pays-d'Enhaut\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.4628333,\r\n" + 
		"                \"longitude\": 6.8419192\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=129\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-scandiano\",\r\n" + 
		"            \"id\": \"bicincitta-scandiano\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Scandiano\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.5982342,\r\n" + 
		"                \"longitude\": 10.6909273\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=94\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-elmas\",\r\n" + 
		"            \"id\": \"bicincitta-elmas\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Elmas\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.2634329,\r\n" + 
		"                \"longitude\": 9.0515805\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=218\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-tivat\",\r\n" + 
		"            \"id\": \"bicincitta-tivat\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"TV\",\r\n" + 
		"                \"country\": \"ME\",\r\n" + 
		"                \"latitude\": 42.4349809,\r\n" + 
		"                \"longitude\": 18.7066398\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=87\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-acquaviva-delle-fonti\",\r\n" + 
		"            \"id\": \"bicincitta-acquaviva-delle-fonti\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Acquaviva delle fonti\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.9303721,\r\n" + 
		"                \"longitude\": 16.8414374\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=160\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/we-love-bike\",\r\n" + 
		"            \"id\": \"we-love-bike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lodi\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.3097228,\r\n" + 
		"                \"longitude\": 9.503715999999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"We Love bike\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=190\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-acquarica-del-capo\",\r\n" + 
		"            \"id\": \"bicincitta-acquarica-del-capo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Acquarica del Capo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.9144573,\r\n" + 
		"                \"longitude\": 18.2450324\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=146\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-vicolungo-the-style-outlets\",\r\n" + 
		"            \"id\": \"bicincitta-vicolungo-the-style-outlets\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vicolungo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.47167229999999,\r\n" + 
		"                \"longitude\": 8.4633922\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=232\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-porto-torres\",\r\n" + 
		"            \"id\": \"bicincitta-porto-torres\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Porto Torres\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.8333682,\r\n" + 
		"                \"longitude\": 8.402292899999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=221\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-cisterna-di-latina\",\r\n" + 
		"            \"id\": \"bicincitta-cisterna-di-latina\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cisterna di Latina\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 41.5754029,\r\n" + 
		"                \"longitude\": 12.8284772\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=217\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-casaletto-spartano\",\r\n" + 
		"            \"id\": \"bicincitta-casaletto-spartano\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Casaletto Spartano\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.1532801,\r\n" + 
		"                \"longitude\": 15.6211479\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=199\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-selargius\",\r\n" + 
		"            \"id\": \"bicincitta-selargius\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Selargius\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 39.2596768,\r\n" + 
		"                \"longitude\": 9.1629372\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=219\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-yverdon-les-bains\",\r\n" + 
		"            \"id\": \"bicincitta-yverdon-les-bains\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Yverdon-les-Bains\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.7784736,\r\n" + 
		"                \"longitude\": 6.641183\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=116\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-monza\",\r\n" + 
		"            \"id\": \"bicincitta-monza\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Monza\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.5845001,\r\n" + 
		"                \"longitude\": 9.2744485\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=224\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-la-cote\",\r\n" + 
		"            \"id\": \"bicincitta-la-cote\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nyon\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.3832683,\r\n" + 
		"                \"longitude\": 6.2347852\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=32\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-morigerati\",\r\n" + 
		"            \"id\": \"bicincitta-morigerati\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Morigerati\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.1422031,\r\n" + 
		"                \"longitude\": 15.5298525\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=200\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-san-donato-milanese\",\r\n" + 
		"            \"id\": \"bicincitta-san-donato-milanese\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Donato Milanese\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.4092402,\r\n" + 
		"                \"longitude\": 9.2684867\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=234\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-chablais\",\r\n" + 
		"            \"id\": \"bicincitta-chablais\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Monthey - Aigle\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.2521873,\r\n" + 
		"                \"longitude\": 6.9469598\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=60\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-ente-parco-del-circeo\",\r\n" + 
		"            \"id\": \"bicincitta-ente-parco-del-circeo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Parco Nazionale del Circeo\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 41.3151015,\r\n" + 
		"                \"longitude\": 13.0330782\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=135\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-cesena\",\r\n" + 
		"            \"id\": \"bicincitta-cesena\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cesena\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.1396438,\r\n" + 
		"                \"longitude\": 12.2464292\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=120\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-lugano-paradiso\",\r\n" + 
		"            \"id\": \"bicincitta-lugano-paradiso\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Paradiso\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 45.9907174,\r\n" + 
		"                \"longitude\": 8.945261799999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=130\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lecco\",\r\n" + 
		"            \"id\": \"lecco\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lecco\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.8565698,\r\n" + 
		"                \"longitude\": 9.397670399999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=49\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-alghero\",\r\n" + 
		"            \"id\": \"bicincitta-alghero\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Alghero\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 40.5579517,\r\n" + 
		"                \"longitude\": 8.319294900000001\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=237\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-san-giovanni-in-persiceto\",\r\n" + 
		"            \"id\": \"bicincitta-san-giovanni-in-persiceto\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"San Giovanni in Persiceto\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.6405433,\r\n" + 
		"                \"longitude\": 11.1893053\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in Bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=101\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-ente-parco-san-rossore\",\r\n" + 
		"            \"id\": \"bicincitta-ente-parco-san-rossore\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Parco naturale Migliarino San Rossore Massaciuccoli\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 43.723826,\r\n" + 
		"                \"longitude\": 10.339509\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=145\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-treviglio\",\r\n" + 
		"            \"id\": \"bicincitta-treviglio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Treviglio\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.5293372,\r\n" + 
		"                \"longitude\": 9.591435899999999\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=174\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-lavis\",\r\n" + 
		"            \"id\": \"bicincitta-lavis\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lavis\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 46.1408423,\r\n" + 
		"                \"longitude\": 11.1124935\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=238\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-les-lacs-romont\",\r\n" + 
		"            \"id\": \"bicincitta-les-lacs-romont\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Murten\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.92922110000001,\r\n" + 
		"                \"longitude\": 7.120184\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=35\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-ente-parco-di-montemarcello-magra\",\r\n" + 
		"            \"id\": \"bicincitta-ente-parco-di-montemarcello-magra\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ente Parco Montemarcello Magra\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.1143897,\r\n" + 
		"                \"longitude\": 9.9635986\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bicincittà\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=132\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicischio\",\r\n" + 
		"            \"id\": \"bicischio\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Schio\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.7170517,\r\n" + 
		"                \"longitude\": 11.3597702\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BiciSchio\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=91\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-imola\",\r\n" + 
		"            \"id\": \"bicincitta-imola\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Imola\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 44.3559128,\r\n" + 
		"                \"longitude\": 11.7161197\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Mi Muovo in bici\",\r\n" + 
		"            \"source\": \"http://www.mimuovoinbici.it/frmLeStazioni.aspx?ID=196\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-leipzig\",\r\n" + 
		"            \"id\": \"nextbike-leipzig\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Leipzig\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.3415,\r\n" + 
		"                \"longitude\": 12.3625\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/norisbike-nurnberg\",\r\n" + 
		"            \"id\": \"norisbike-nurnberg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nürnberg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.4479,\r\n" + 
		"                \"longitude\": 11.0814\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"NorisBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-wiesbaden\",\r\n" + 
		"            \"id\": \"nextbike-wiesbaden\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wiesbaden\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.0709,\r\n" + 
		"                \"longitude\": 8.24322\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/visa-frankfurt\",\r\n" + 
		"            \"id\": \"visa-frankfurt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Frankfurt\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.1072,\r\n" + 
		"                \"longitude\": 8.66375\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VISA\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/kvb-rad-koln\",\r\n" + 
		"            \"id\": \"kvb-rad-koln\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Köln\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.9429,\r\n" + 
		"                \"longitude\": 6.95649\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"KVB Rad\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/facherrad-karlsruhe\",\r\n" + 
		"            \"id\": \"facherrad-karlsruhe\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Karlsruhe\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.0102,\r\n" + 
		"                \"longitude\": 8.41827\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Fächerrad\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/burgenland-neusiedler-see\",\r\n" + 
		"            \"id\": \"burgenland-neusiedler-see\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Neusiedler See\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.839,\r\n" + 
		"                \"longitude\": 16.761\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Burgenland\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-offenbach-am-main\",\r\n" + 
		"            \"id\": \"nextbike-offenbach-am-main\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Offenbach am Main\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.1093,\r\n" + 
		"                \"longitude\": 8.73825\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-auckland\",\r\n" + 
		"            \"id\": \"nextbike-auckland\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Auckland\",\r\n" + 
		"                \"country\": \"NZ\",\r\n" + 
		"                \"latitude\": -36.8603,\r\n" + 
		"                \"longitude\": 174.763\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-magdeburg\",\r\n" + 
		"            \"id\": \"nextbike-magdeburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Magdeburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 52.1268,\r\n" + 
		"                \"longitude\": 11.6342\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-hamburg\",\r\n" + 
		"            \"id\": \"nextbike-hamburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hamburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 53.5506,\r\n" + 
		"                \"longitude\": 9.99052\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-dusseldorf\",\r\n" + 
		"            \"id\": \"nextbike-dusseldorf\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Düsseldorf\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.2243,\r\n" + 
		"                \"longitude\": 6.77204\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-stpolten\",\r\n" + 
		"            \"id\": \"nextbike-stpolten\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"St.Pölten\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.2058,\r\n" + 
		"                \"longitude\": 15.6232\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-modling\",\r\n" + 
		"            \"id\": \"nextbike-modling\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mödling\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.1047,\r\n" + 
		"                \"longitude\": 16.3202\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-sursee\",\r\n" + 
		"            \"id\": \"nextbike-sursee\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sursee\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 47.1713,\r\n" + 
		"                \"longitude\": 8.10877\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-tubingen\",\r\n" + 
		"            \"id\": \"nextbike-tubingen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tübingen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.5203,\r\n" + 
		"                \"longitude\": 9.05591\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-luzern\",\r\n" + 
		"            \"id\": \"nextbike-luzern\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Luzern\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 47.0472,\r\n" + 
		"                \"longitude\": 8.30446\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sixt-riga\",\r\n" + 
		"            \"id\": \"sixt-riga\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rīga\",\r\n" + 
		"                \"country\": \"LV\",\r\n" + 
		"                \"latitude\": 56.9453,\r\n" + 
		"                \"longitude\": 24.1033\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SiXT\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-dortmund\",\r\n" + 
		"            \"id\": \"metropolradruhr-dortmund\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dortmund\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.5141,\r\n" + 
		"                \"longitude\": 7.46255\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-bochum\",\r\n" + 
		"            \"id\": \"metropolradruhr-bochum\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bochum\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.4813,\r\n" + 
		"                \"longitude\": 7.2133\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-bottrop\",\r\n" + 
		"            \"id\": \"metropolradruhr-bottrop\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bottrop\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.5263,\r\n" + 
		"                \"longitude\": 6.94611\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-duisburg\",\r\n" + 
		"            \"id\": \"metropolradruhr-duisburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Duisburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.4487,\r\n" + 
		"                \"longitude\": 6.77513\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-essen\",\r\n" + 
		"            \"id\": \"metropolradruhr-essen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Essen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.4425,\r\n" + 
		"                \"longitude\": 7.02301\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-gelsenkirchen\",\r\n" + 
		"            \"id\": \"metropolradruhr-gelsenkirchen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gelsenkirchen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.5404,\r\n" + 
		"                \"longitude\": 7.07039\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-hamm\",\r\n" + 
		"            \"id\": \"metropolradruhr-hamm\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hamm\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.6775,\r\n" + 
		"                \"longitude\": 7.84836\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-herne\",\r\n" + 
		"            \"id\": \"metropolradruhr-herne\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Herne\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.5363,\r\n" + 
		"                \"longitude\": 7.21493\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-mulheim-adr\",\r\n" + 
		"            \"id\": \"metropolradruhr-mulheim-adr\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mülheim a.d.R.\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.4308,\r\n" + 
		"                \"longitude\": 6.87401\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/metropolradruhr-oberhausen\",\r\n" + 
		"            \"id\": \"metropolradruhr-oberhausen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Oberhausen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.4936,\r\n" + 
		"                \"longitude\": 6.85169\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"metropolradruhr\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-munchen\",\r\n" + 
		"            \"id\": \"nextbike-munchen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"München\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.1358,\r\n" + 
		"                \"longitude\": 11.5356\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sixt-jurmala\",\r\n" + 
		"            \"id\": \"sixt-jurmala\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Jūrmala\",\r\n" + 
		"                \"country\": \"LV\",\r\n" + 
		"                \"latitude\": 56.9732,\r\n" + 
		"                \"longitude\": 23.8225\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SiXT\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-wachau\",\r\n" + 
		"            \"id\": \"nextbike-wachau\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wachau\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.3188,\r\n" + 
		"                \"longitude\": 15.4166\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-tulln\",\r\n" + 
		"            \"id\": \"nextbike-tulln\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tulln\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.3269,\r\n" + 
		"                \"longitude\": 16.0569\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-triestingtal\",\r\n" + 
		"            \"id\": \"nextbike-triestingtal\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Triestingtal\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.9421,\r\n" + 
		"                \"longitude\": 16.1149\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-thermenregion\",\r\n" + 
		"            \"id\": \"nextbike-thermenregion\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Thermenregion\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.9892,\r\n" + 
		"                \"longitude\": 16.2646\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-flensburg\",\r\n" + 
		"            \"id\": \"nextbike-flensburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Flensburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 54.7804,\r\n" + 
		"                \"longitude\": 9.43571\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/wrm-wroclaw\",\r\n" + 
		"            \"id\": \"wrm-wroclaw\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wrocław\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.1097,\r\n" + 
		"                \"longitude\": 17.0485\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"WRM\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-romerland\",\r\n" + 
		"            \"id\": \"nextbike-romerland\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Römerland\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.0909,\r\n" + 
		"                \"longitude\": 16.853\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-offenburg\",\r\n" + 
		"            \"id\": \"nextbike-offenburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Offenburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.4721,\r\n" + 
		"                \"longitude\": 7.94243\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-wrneustadt\",\r\n" + 
		"            \"id\": \"nextbike-wrneustadt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wr.Neustadt\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.8167,\r\n" + 
		"                \"longitude\": 16.2426\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-potsdam\",\r\n" + 
		"            \"id\": \"nextbike-potsdam\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Potsdam\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 52.3997,\r\n" + 
		"                \"longitude\": 13.0676\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-gutersloh\",\r\n" + 
		"            \"id\": \"nextbike-gutersloh\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gütersloh\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.9049,\r\n" + 
		"                \"longitude\": 8.39275\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-unteres-traisental\",\r\n" + 
		"            \"id\": \"nextbike-unteres-traisental\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Unteres Traisental\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.1111,\r\n" + 
		"                \"longitude\": 15.8176\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-haag\",\r\n" + 
		"            \"id\": \"nextbike-haag\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Haag\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.0643,\r\n" + 
		"                \"longitude\": 14.7368\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-marchfeld\",\r\n" + 
		"            \"id\": \"nextbike-marchfeld\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Marchfeld\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.2407,\r\n" + 
		"                \"longitude\": 16.9093\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-10vorwien\",\r\n" + 
		"            \"id\": \"nextbike-10vorwien\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"10vorWien\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.3403,\r\n" + 
		"                \"longitude\": 16.279\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/usedomrad-usedom\",\r\n" + 
		"            \"id\": \"usedomrad-usedom\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Usedom\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 53.9779,\r\n" + 
		"                \"longitude\": 13.9925\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"UsedomRad\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-norderstedt\",\r\n" + 
		"            \"id\": \"nextbike-norderstedt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Norderstedt\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 53.6969,\r\n" + 
		"                \"longitude\": 10.002\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/swa-rad-augsburg\",\r\n" + 
		"            \"id\": \"swa-rad-augsburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Augsburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.3647,\r\n" + 
		"                \"longitude\": 10.8916\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SWA Rad\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-traisen-golsental\",\r\n" + 
		"            \"id\": \"nextbike-traisen-golsental\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Traisen-Gölsental\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.9439,\r\n" + 
		"                \"longitude\": 15.639\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-lunz-am-see\",\r\n" + 
		"            \"id\": \"nextbike-lunz-am-see\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lunz am See\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.8618,\r\n" + 
		"                \"longitude\": 15.0348\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-konya\",\r\n" + 
		"            \"id\": \"nextbike-konya\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Konya\",\r\n" + 
		"                \"country\": \"TR\",\r\n" + 
		"                \"latitude\": 37.8715,\r\n" + 
		"                \"longitude\": 32.4957\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-laa-an-der-thaya\",\r\n" + 
		"            \"id\": \"nextbike-laa-an-der-thaya\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Laa an der Thaya\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.7196,\r\n" + 
		"                \"longitude\": 16.3878\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-sudheide\",\r\n" + 
		"            \"id\": \"nextbike-sudheide\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Südheide\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.1077,\r\n" + 
		"                \"longitude\": 16.3937\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-limassol\",\r\n" + 
		"            \"id\": \"nextbike-limassol\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Limassol\",\r\n" + 
		"                \"country\": \"CY\",\r\n" + 
		"                \"latitude\": 34.6823,\r\n" + 
		"                \"longitude\": 33.0464\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/prm-poznan\",\r\n" + 
		"            \"id\": \"prm-poznan\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Poznań\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.4077,\r\n" + 
		"                \"longitude\": 16.9323\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"PRM\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-christchurch\",\r\n" + 
		"            \"id\": \"nextbike-christchurch\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Christchurch\",\r\n" + 
		"                \"country\": \"NZ\",\r\n" + 
		"                \"latitude\": -43.5341,\r\n" + 
		"                \"longitude\": 172.621\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-heidelberg\",\r\n" + 
		"            \"id\": \"vrn-heidelberg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Heidelberg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.4023,\r\n" + 
		"                \"longitude\": 8.67577\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-mannheim\",\r\n" + 
		"            \"id\": \"vrn-mannheim\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mannheim\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.4869,\r\n" + 
		"                \"longitude\": 8.45638\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-tullnerfeld-west\",\r\n" + 
		"            \"id\": \"nextbike-tullnerfeld-west\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tullnerfeld West\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.2994,\r\n" + 
		"                \"longitude\": 15.9065\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/stadtrad-innsbruck\",\r\n" + 
		"            \"id\": \"stadtrad-innsbruck\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Innsbruck\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.2632,\r\n" + 
		"                \"longitude\": 11.3961\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Stadtrad\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-nicosia\",\r\n" + 
		"            \"id\": \"nextbike-nicosia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nicosia\",\r\n" + 
		"                \"country\": \"CY\",\r\n" + 
		"                \"latitude\": 35.1728,\r\n" + 
		"                \"longitude\": 33.3653\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/opole-bike-opole\",\r\n" + 
		"            \"id\": \"opole-bike-opole\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Opole\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.6633,\r\n" + 
		"                \"longitude\": 17.9239\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Opole Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/veturilo-warszawa\",\r\n" + 
		"            \"id\": \"veturilo-warszawa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Warszawa\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.2265,\r\n" + 
		"                \"longitude\": 21.0127\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VETURILO\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-hollabrunn\",\r\n" + 
		"            \"id\": \"nextbike-hollabrunn\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hollabrunn\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.562,\r\n" + 
		"                \"longitude\": 16.0785\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-wienerwald\",\r\n" + 
		"            \"id\": \"nextbike-wienerwald\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"WienerWald\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.1926,\r\n" + 
		"                \"longitude\": 16.141\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-dobrich\",\r\n" + 
		"            \"id\": \"nextbike-dobrich\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dobrich\",\r\n" + 
		"                \"country\": \"BG\",\r\n" + 
		"                \"latitude\": 43.567,\r\n" + 
		"                \"longitude\": 27.8285\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bykystations-uae-dubai\",\r\n" + 
		"            \"id\": \"bykystations-uae-dubai\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dubai\",\r\n" + 
		"                \"country\": \"AE\",\r\n" + 
		"                \"latitude\": 25.2435,\r\n" + 
		"                \"longitude\": 55.2722\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BYKYstations UAE\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-zagreb\",\r\n" + 
		"            \"id\": \"nextbike-zagreb\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zagreb\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.7984,\r\n" + 
		"                \"longitude\": 15.9789\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-bietigheim-bissingen\",\r\n" + 
		"            \"id\": \"ebikestation-bietigheim-bissingen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bietigheim-Bissingen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.9495,\r\n" + 
		"                \"longitude\": 9.12518\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-bath\",\r\n" + 
		"            \"id\": \"nextbike-bath\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bath\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 51.3793,\r\n" + 
		"                \"longitude\": -2.35279\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-glasgow\",\r\n" + 
		"            \"id\": \"nextbike-glasgow\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Glasgow\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 55.8589,\r\n" + 
		"                \"longitude\": -4.25549\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/belfastbikes-belfast\",\r\n" + 
		"            \"id\": \"belfastbikes-belfast\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Belfast\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 54.5969,\r\n" + 
		"                \"longitude\": -5.92918\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BelfastBikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-stirling\",\r\n" + 
		"            \"id\": \"nextbike-stirling\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Stirling\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 56.1165,\r\n" + 
		"                \"longitude\": -3.9369\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/biker-bialystok-bialystok\",\r\n" + 
		"            \"id\": \"biker-bialystok-bialystok\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Białystok\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 53.2655,\r\n" + 
		"                \"longitude\": 23.3343\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BIKER Białystok\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/krm-konstancinski-konstancin-jeziorna\",\r\n" + 
		"            \"id\": \"krm-konstancinski-konstancin-jeziorna\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Konstancin Jeziorna\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.0759,\r\n" + 
		"                \"longitude\": 21.1161\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"KRM Konstanciński\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-sibenik-sibenik\",\r\n" + 
		"            \"id\": \"grad-sibenik-sibenik\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Šibenik\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 43.733,\r\n" + 
		"                \"longitude\": 15.8982\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Šibenik\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/karbis-seferihisar\",\r\n" + 
		"            \"id\": \"karbis-seferihisar\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Seferihisar\",\r\n" + 
		"                \"country\": \"TR\",\r\n" + 
		"                \"latitude\": 38.1962,\r\n" + 
		"                \"longitude\": 26.8386\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"KARBIS\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lrm-lublin-lublin\",\r\n" + 
		"            \"id\": \"lrm-lublin-lublin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lublin\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.2469,\r\n" + 
		"                \"longitude\": 22.5697\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"LRM Lublin\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-schwieberdingen\",\r\n" + 
		"            \"id\": \"ebikestation-schwieberdingen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Schwieberdingen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.8723,\r\n" + 
		"                \"longitude\": 9.07419\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/healthy-ride-pittsburgh-pittsburgh\",\r\n" + 
		"            \"id\": \"healthy-ride-pittsburgh-pittsburgh\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pittsburgh\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.4459,\r\n" + 
		"                \"longitude\": -79.9945\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Healthy Ride\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grm-grodzisk-grodzisk-mazowiecki\",\r\n" + 
		"            \"id\": \"grm-grodzisk-grodzisk-mazowiecki\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Grodzisk Mazowiecki\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.113,\r\n" + 
		"                \"longitude\": 20.6265\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"GRM Grodzisk\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-quickborn\",\r\n" + 
		"            \"id\": \"nextbike-quickborn\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Quickborn\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 53.7333,\r\n" + 
		"                \"longitude\": 9.90272\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jerseybike-hoboken\",\r\n" + 
		"            \"id\": \"jerseybike-hoboken\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hoboken\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.7447,\r\n" + 
		"                \"longitude\": -74.0341\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JerseyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jerseybike-weehawken\",\r\n" + 
		"            \"id\": \"jerseybike-weehawken\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Weehawken\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.7683,\r\n" + 
		"                \"longitude\": -74.0216\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JerseyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ibike-king-abdullah-economic-city\",\r\n" + 
		"            \"id\": \"ibike-king-abdullah-economic-city\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"King Abdullah Economic City\",\r\n" + 
		"                \"country\": \"SA\",\r\n" + 
		"                \"latitude\": 22.4053,\r\n" + 
		"                \"longitude\": 39.0815\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"iBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-ludwigshafen\",\r\n" + 
		"            \"id\": \"vrn-ludwigshafen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ludwigshafen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.4741,\r\n" + 
		"                \"longitude\": 8.43287\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-university-of-warwick\",\r\n" + 
		"            \"id\": \"nextbike-university-of-warwick\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Warwick\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 52.3815,\r\n" + 
		"                \"longitude\": -1.56159\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-waiblingen\",\r\n" + 
		"            \"id\": \"ebikestation-waiblingen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Waiblingen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.8333,\r\n" + 
		"                \"longitude\": 9.31667\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-speyer\",\r\n" + 
		"            \"id\": \"vrn-speyer\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Speyer\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.3126,\r\n" + 
		"                \"longitude\": 8.45295\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-lviv\",\r\n" + 
		"            \"id\": \"nextbike-lviv\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lviv\",\r\n" + 
		"                \"country\": \"UA\",\r\n" + 
		"                \"latitude\": 49.8402,\r\n" + 
		"                \"longitude\": 24.0182\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-wurzburg\",\r\n" + 
		"            \"id\": \"nextbike-wurzburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Würzburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.8,\r\n" + 
		"                \"longitude\": 9.93333\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/skybike-west-palm-beach-west-palm-beach-florida\",\r\n" + 
		"            \"id\": \"skybike-west-palm-beach-west-palm-beach-florida\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"West Palm Beach Florida\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 26.7125,\r\n" + 
		"                \"longitude\": -80.0821\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Skybike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-serfaus\",\r\n" + 
		"            \"id\": \"nextbike-serfaus\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Serfaus\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.0387,\r\n" + 
		"                \"longitude\": 10.6048\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-vaihingen-an-der-enz\",\r\n" + 
		"            \"id\": \"ebikestation-vaihingen-an-der-enz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vaihingen an der Enz\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.9334,\r\n" + 
		"                \"longitude\": 8.96121\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-herrenberg\",\r\n" + 
		"            \"id\": \"ebikestation-herrenberg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Herrenberg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.595,\r\n" + 
		"                \"longitude\": 8.86716\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-goppingen\",\r\n" + 
		"            \"id\": \"ebikestation-goppingen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Göppingen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.7054,\r\n" + 
		"                \"longitude\": 9.65125\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-ludwigsburg\",\r\n" + 
		"            \"id\": \"ebikestation-ludwigsburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ludwigsburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.8941,\r\n" + 
		"                \"longitude\": 9.19546\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-gospic-gospic\",\r\n" + 
		"            \"id\": \"grad-gospic-gospic\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gospić\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 44.5469,\r\n" + 
		"                \"longitude\": 15.375\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Gospić\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-holzgerlingen\",\r\n" + 
		"            \"id\": \"ebikestation-holzgerlingen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Holzgerlingen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.6388,\r\n" + 
		"                \"longitude\": 9.0096\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-filderstadt\",\r\n" + 
		"            \"id\": \"ebikestation-filderstadt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Filderstadt\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.6588,\r\n" + 
		"                \"longitude\": 9.22585\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-kirchheim-am-neckar\",\r\n" + 
		"            \"id\": \"ebikestation-kirchheim-am-neckar\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kirchheim am Neckar\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.04,\r\n" + 
		"                \"longitude\": 9.14441\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-schorndorf\",\r\n" + 
		"            \"id\": \"ebikestation-schorndorf\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Schorndorf\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.8015,\r\n" + 
		"                \"longitude\": 9.52962\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-fellbach\",\r\n" + 
		"            \"id\": \"ebikestation-fellbach\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Fellbach\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.8166,\r\n" + 
		"                \"longitude\": 9.27967\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ebikestation-remseck-am-neckar\",\r\n" + 
		"            \"id\": \"ebikestation-remseck-am-neckar\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Remseck am Neckar\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.8767,\r\n" + 
		"                \"longitude\": 9.26179\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"ebikestation\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-malta\",\r\n" + 
		"            \"id\": \"nextbike-malta\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Malta\",\r\n" + 
		"                \"country\": \"MT\",\r\n" + 
		"                \"latitude\": 35.9192,\r\n" + 
		"                \"longitude\": 14.4889\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-karlovac-karlovac\",\r\n" + 
		"            \"id\": \"grad-karlovac-karlovac\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Karlovac\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.4905,\r\n" + 
		"                \"longitude\": 15.5503\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Karlovac\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/flashfleet-kent-state-university-kent-state-university\",\r\n" + 
		"            \"id\": \"flashfleet-kent-state-university-kent-state-university\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kent State\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 41.1492,\r\n" + 
		"                \"longitude\": -81.3363\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Flashfleet Kent State University\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-slavonski-brod-slavonski-brod\",\r\n" + 
		"            \"id\": \"grad-slavonski-brod-slavonski-brod\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Slavonski Brod\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.1656,\r\n" + 
		"                \"longitude\": 18.0183\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Slavonski Brod\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-london\",\r\n" + 
		"            \"id\": \"nextbike-london\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"London\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 51.4862,\r\n" + 
		"                \"longitude\": -0.11966\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/santander-cycles-mk-milton-keynes\",\r\n" + 
		"            \"id\": \"santander-cycles-mk-milton-keynes\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Milton Keynes\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 52.0406,\r\n" + 
		"                \"longitude\": -0.759417\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Santander Cycles MK\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bykystations-uae-al-ain\",\r\n" + 
		"            \"id\": \"bykystations-uae-al-ain\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Al Ain\",\r\n" + 
		"                \"country\": \"AE\",\r\n" + 
		"                \"latitude\": 24.2989,\r\n" + 
		"                \"longitude\": 54.6979\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BYKYstations UAE\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-hergiswil\",\r\n" + 
		"            \"id\": \"nextbike-hergiswil\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hergiswil\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.9905,\r\n" + 
		"                \"longitude\": 8.30829\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-makarska-makarska\",\r\n" + 
		"            \"id\": \"grad-makarska-makarska\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Makarska\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 43.2992,\r\n" + 
		"                \"longitude\": 17.0184\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Makarska\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/opcina-brinje-brinje\",\r\n" + 
		"            \"id\": \"opcina-brinje-brinje\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Brinje\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 44.9977,\r\n" + 
		"                \"longitude\": 15.1258\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Općina Brinje\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-zadar-zadar\",\r\n" + 
		"            \"id\": \"grad-zadar-zadar\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zadar\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 44.0058,\r\n" + 
		"                \"longitude\": 15.2183\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Zadar\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-vukovar-vukovar\",\r\n" + 
		"            \"id\": \"grad-vukovar-vukovar\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vukovar\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.3575,\r\n" + 
		"                \"longitude\": 18.9895\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/opcina-lastovo-lastovo\",\r\n" + 
		"            \"id\": \"opcina-lastovo-lastovo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lastovo\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 42.7626,\r\n" + 
		"                \"longitude\": 16.8719\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Općina Lastovo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lodzki-rower-publiczny-lodz\",\r\n" + 
		"            \"id\": \"lodzki-rower-publiczny-lodz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lódź\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.7689,\r\n" + 
		"                \"longitude\": 19.4554\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Łódzki Rower Publiczny\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lrm-lublin-swidnik\",\r\n" + 
		"            \"id\": \"lrm-lublin-swidnik\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Świdnik\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.2194,\r\n" + 
		"                \"longitude\": 22.6988\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"LRM Lublin\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-bensheim\",\r\n" + 
		"            \"id\": \"vrn-bensheim\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bensheim\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.6803,\r\n" + 
		"                \"longitude\": 8.6189\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-ivanic-grad-ivanic-grad\",\r\n" + 
		"            \"id\": \"grad-ivanic-grad-ivanic-grad\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ivanic Grad\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.7062,\r\n" + 
		"                \"longitude\": 16.3919\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Ivanić-Grad\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/stalowa-wola-miasto-rowerow-stalowa-wola\",\r\n" + 
		"            \"id\": \"stalowa-wola-miasto-rowerow-stalowa-wola\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Stalowa Wola\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.57,\r\n" + 
		"                \"longitude\": 22.0626\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Stalowa Wola miasto rowerów\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/katowice-bike-katowice\",\r\n" + 
		"            \"id\": \"katowice-bike-katowice\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Katowice\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.2594,\r\n" + 
		"                \"longitude\": 19.0215\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Katowice Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bike-s-srm-szczecin\",\r\n" + 
		"            \"id\": \"bike-s-srm-szczecin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Szczecin\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 53.4301,\r\n" + 
		"                \"longitude\": 14.5498\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Bike_S SRM\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ordu-bisikletli-ordu\",\r\n" + 
		"            \"id\": \"ordu-bisikletli-ordu\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ordu\",\r\n" + 
		"                \"country\": \"TR\",\r\n" + 
		"                \"latitude\": 40.9702,\r\n" + 
		"                \"longitude\": 37.8707\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Ordu Bisikletli\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-sarajevo\",\r\n" + 
		"            \"id\": \"nextbike-sarajevo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sarajevo\",\r\n" + 
		"                \"country\": \"BA\",\r\n" + 
		"                \"latitude\": 43.85,\r\n" + 
		"                \"longitude\": 18.39\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/co-bikes-exeter\",\r\n" + 
		"            \"id\": \"co-bikes-exeter\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Exeter\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 50.7272,\r\n" + 
		"                \"longitude\": -3.53605\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Co-bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rower-gminny-michalowice-michalowice\",\r\n" + 
		"            \"id\": \"rower-gminny-michalowice-michalowice\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Michałowice\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.1679,\r\n" + 
		"                \"longitude\": 20.8877\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rower Gminny Michałowice\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-auckland-waterfront\",\r\n" + 
		"            \"id\": \"nextbike-auckland-waterfront\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Auckland Waterfront\",\r\n" + 
		"                \"country\": \"NZ\",\r\n" + 
		"                \"latitude\": -36.841,\r\n" + 
		"                \"longitude\": 174.763\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-berlin\",\r\n" + 
		"            \"id\": \"nextbike-berlin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Berlin\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 52.5087,\r\n" + 
		"                \"longitude\": 13.3563\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/system-legnicki-rower-miejski-slrm-legnica\",\r\n" + 
		"            \"id\": \"system-legnicki-rower-miejski-slrm-legnica\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Legnica\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.2059,\r\n" + 
		"                \"longitude\": 16.1667\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"System Legnicki Rower Miejski (SLRM)\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-aruba\",\r\n" + 
		"            \"id\": \"nextbike-aruba\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Aruba\",\r\n" + 
		"                \"country\": \"AW\",\r\n" + 
		"                \"latitude\": 12.5137,\r\n" + 
		"                \"longitude\": -69.9757\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-hyderabad\",\r\n" + 
		"            \"id\": \"nextbike-hyderabad\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hyderabad\",\r\n" + 
		"                \"country\": \"IN\",\r\n" + 
		"                \"latitude\": 17.38,\r\n" + 
		"                \"longitude\": 78.4725\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sixt-jalgrattarent-tallinn\",\r\n" + 
		"            \"id\": \"sixt-jalgrattarent-tallinn\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tallinn\",\r\n" + 
		"                \"country\": \"EE\",\r\n" + 
		"                \"latitude\": 59.4325,\r\n" + 
		"                \"longitude\": 24.7295\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"SIXT jalgrattarent\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/veturilo-stacje-sponsorskie-nextbike-veturilo\",\r\n" + 
		"            \"id\": \"veturilo-stacje-sponsorskie-nextbike-veturilo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Warszawa\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.2265,\r\n" + 
		"                \"longitude\": 21.0127\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Stacje Sponsorskie Nextbike Veturilo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bike4all-byblos\",\r\n" + 
		"            \"id\": \"bike4all-byblos\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Byblos\",\r\n" + 
		"                \"country\": \"LB\",\r\n" + 
		"                \"latitude\": 34.1236,\r\n" + 
		"                \"longitude\": 35.6511\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"bike4all\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/chartered-bike-bhopal-bhopal\",\r\n" + 
		"            \"id\": \"chartered-bike-bhopal-bhopal\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bhopal\",\r\n" + 
		"                \"country\": \"IN\",\r\n" + 
		"                \"latitude\": 23.2467,\r\n" + 
		"                \"longitude\": 77.411\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Chartered Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-rotterdam\",\r\n" + 
		"            \"id\": \"nextbike-rotterdam\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rotterdam\",\r\n" + 
		"                \"country\": \"IN\",\r\n" + 
		"                \"latitude\": 51.9224,\r\n" + 
		"                \"longitude\": 4.47265\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/wk-bike-bremen-bremen\",\r\n" + 
		"            \"id\": \"wk-bike-bremen-bremen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bremen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 53.0781,\r\n" + 
		"                \"longitude\": 8.80132\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"WK-Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-worms\",\r\n" + 
		"            \"id\": \"vrn-worms\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Worms\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.6394,\r\n" + 
		"                \"longitude\": 8.34618\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-stans\",\r\n" + 
		"            \"id\": \"nextbike-stans\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Stans\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.9593,\r\n" + 
		"                \"longitude\": 8.36836\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-victoria\",\r\n" + 
		"            \"id\": \"nextbike-victoria\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Victoria\",\r\n" + 
		"                \"country\": \"CA\",\r\n" + 
		"                \"latitude\": 48.4298,\r\n" + 
		"                \"longitude\": -123.361\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-maastricht\",\r\n" + 
		"            \"id\": \"nextbike-maastricht\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Maastricht\",\r\n" + 
		"                \"country\": \"NL\",\r\n" + 
		"                \"latitude\": 50.8514,\r\n" + 
		"                \"longitude\": 5.69129\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-stansstad\",\r\n" + 
		"            \"id\": \"nextbike-stansstad\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Stansstad\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.9801,\r\n" + 
		"                \"longitude\": 8.34098\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/byky-bikes-kuwait\",\r\n" + 
		"            \"id\": \"byky-bikes-kuwait\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kuwait\",\r\n" + 
		"                \"country\": \"KW\",\r\n" + 
		"                \"latitude\": 29.3632,\r\n" + 
		"                \"longitude\": 47.487\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BYKY Bikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-horw\",\r\n" + 
		"            \"id\": \"nextbike-horw\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Horw\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 47.0188,\r\n" + 
		"                \"longitude\": 8.30828\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-burstadt\",\r\n" + 
		"            \"id\": \"vrn-burstadt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bürstadt\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.6461,\r\n" + 
		"                \"longitude\": 8.44917\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/gliwicki-rower-miejski-sgrm-gliwice\",\r\n" + 
		"            \"id\": \"gliwicki-rower-miejski-sgrm-gliwice\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gliwice\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.2918,\r\n" + 
		"                \"longitude\": 18.669\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Gliwicki Rower Miejski (SGRM)\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/prm-stacje-sponsorskie-nextbike-prm\",\r\n" + 
		"            \"id\": \"prm-stacje-sponsorskie-nextbike-prm\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Poznań\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.4077,\r\n" + 
		"                \"longitude\": 16.9323\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Stacje Sponsorskie Nextbike PRM\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-gross-enzersdorf\",\r\n" + 
		"            \"id\": \"nextbike-gross-enzersdorf\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Groß Enzersdorf\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.1986,\r\n" + 
		"                \"longitude\": 16.5496\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-klagenfurt\",\r\n" + 
		"            \"id\": \"nextbike-klagenfurt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Klagenfurt\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 46.6335,\r\n" + 
		"                \"longitude\": 14.3085\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-kaiserslautern\",\r\n" + 
		"            \"id\": \"vrn-kaiserslautern\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kaiserslautern\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.4413,\r\n" + 
		"                \"longitude\": 7.75566\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/radomski-rower-miejski-radom\",\r\n" + 
		"            \"id\": \"radomski-rower-miejski-radom\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Radom\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.3994,\r\n" + 
		"                \"longitude\": 21.1655\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Radomski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/radomski-rower-miejski-stacje-sponsorskie-radom\",\r\n" + 
		"            \"id\": \"radomski-rower-miejski-stacje-sponsorskie-radom\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Radom\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.3994,\r\n" + 
		"                \"longitude\": 21.1655\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Stacje Sponsorskie Radom\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/smartbike-vijayawada-vijayawada\",\r\n" + 
		"            \"id\": \"smartbike-vijayawada-vijayawada\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vijayawada\",\r\n" + 
		"                \"country\": \"IN\",\r\n" + 
		"                \"latitude\": 16.5109,\r\n" + 
		"                \"longitude\": 80.6313\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Smartbike Vijayawada\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sitycleta-las-palmas-las-palmas-de-gran-canaria\",\r\n" + 
		"            \"id\": \"sitycleta-las-palmas-las-palmas-de-gran-canaria\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Las Palmas de Gran Canaria\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 28.1236,\r\n" + 
		"                \"longitude\": -15.4366\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Sitycleta\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/system-rowerow-miejskich-w-pszczynie-pszczyna\",\r\n" + 
		"            \"id\": \"system-rowerow-miejskich-w-pszczynie-pszczyna\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pszczyna\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 49.9757,\r\n" + 
		"                \"longitude\": 18.9463\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"System Rowerów Miejskich w Pszczynie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/zgierski-rower-miejski-zgierz\",\r\n" + 
		"            \"id\": \"zgierski-rower-miejski-zgierz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zgierz\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.8602,\r\n" + 
		"                \"longitude\": 19.4118\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Zgierski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tyski-rower-miejski-tychy\",\r\n" + 
		"            \"id\": \"tyski-rower-miejski-tychy\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tychy\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.1304,\r\n" + 
		"                \"longitude\": 18.9436\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tyski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-amstetten\",\r\n" + 
		"            \"id\": \"nextbike-amstetten\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Amstetten\",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 48.1218,\r\n" + 
		"                \"longitude\": 14.8774\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-velika-gorica-velika-gorica\",\r\n" + 
		"            \"id\": \"grad-velika-gorica-velika-gorica\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Velika Gorica\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.7161,\r\n" + 
		"                \"longitude\": 16.0683\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Velika Gorica\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-sisak-sisak\",\r\n" + 
		"            \"id\": \"grad-sisak-sisak\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sisak\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.4875,\r\n" + 
		"                \"longitude\": 16.3753\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Sisak\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-salzburg\",\r\n" + 
		"            \"id\": \"nextbike-salzburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Salzburg \",\r\n" + 
		"                \"country\": \"AT\",\r\n" + 
		"                \"latitude\": 47.8014,\r\n" + 
		"                \"longitude\": 13.0458\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ok-bike-kedzierzyn-kozle\",\r\n" + 
		"            \"id\": \"ok-bike-kedzierzyn-kozle\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kędzierzyn-Koźle\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.3421,\r\n" + 
		"                \"longitude\": 18.2049\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"OK Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/kolobrzeski-rower-miejski-kolobrzeg\",\r\n" + 
		"            \"id\": \"kolobrzeski-rower-miejski-kolobrzeg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kołobrzeg\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 54.1762,\r\n" + 
		"                \"longitude\": 15.5761\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Kołobrzeski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/siedlecki-rower-miejski-siedlce\",\r\n" + 
		"            \"id\": \"siedlecki-rower-miejski-siedlce\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Siedlce\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.1668,\r\n" + 
		"                \"longitude\": 22.2891\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Siedlecki Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-metkovic-metkovic\",\r\n" + 
		"            \"id\": \"grad-metkovic-metkovic\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Metković\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 43.0654,\r\n" + 
		"                \"longitude\": 17.642\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Grad Metković\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jastrebarsko-jastrebarsko\",\r\n" + 
		"            \"id\": \"jastrebarsko-jastrebarsko\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Jastrebarsko\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.6692,\r\n" + 
		"                \"longitude\": 15.6541\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/grad-drnis-drnis\",\r\n" + 
		"            \"id\": \"grad-drnis-drnis\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Drniš\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 43.8425,\r\n" + 
		"                \"longitude\": 16.1197\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-tuzla\",\r\n" + 
		"            \"id\": \"nextbike-tuzla\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tuzla\",\r\n" + 
		"                \"country\": \"BA\",\r\n" + 
		"                \"latitude\": 44.5392,\r\n" + 
		"                \"longitude\": 18.675\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-panama\",\r\n" + 
		"            \"id\": \"nextbike-panama\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Panama\",\r\n" + 
		"                \"country\": \"IN\",\r\n" + 
		"                \"latitude\": 8.95284,\r\n" + 
		"                \"longitude\": -79.5369\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/porec-bike-share-porec\",\r\n" + 
		"            \"id\": \"porec-bike-share-porec\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Poreč\",\r\n" + 
		"                \"country\": \"HR\",\r\n" + 
		"                \"latitude\": 45.2292,\r\n" + 
		"                \"longitude\": 13.6035\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Porec bike share\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/arriva-nitra\",\r\n" + 
		"            \"id\": \"arriva-nitra\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nitra\",\r\n" + 
		"                \"country\": \"SK\",\r\n" + 
		"                \"latitude\": 48.3088,\r\n" + 
		"                \"longitude\": 18.0783\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Arriva\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/kaliski-rower-miejski-kalisz\",\r\n" + 
		"            \"id\": \"kaliski-rower-miejski-kalisz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kalisz\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.7608,\r\n" + 
		"                \"longitude\": 18.0746\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Kaliski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-marburg\",\r\n" + 
		"            \"id\": \"nextbike-marburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Marburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.8019,\r\n" + 
		"                \"longitude\": 8.76444\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bubi\",\r\n" + 
		"            \"id\": \"bubi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Budapest\",\r\n" + 
		"                \"country\": \"HU\",\r\n" + 
		"                \"latitude\": 47.497912,\r\n" + 
		"                \"longitude\": 19.040235\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"MOL Bubi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-russelsheim-am-main\",\r\n" + 
		"            \"id\": \"nextbike-russelsheim-am-main\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Rüsselsheim am Main\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.9881,\r\n" + 
		"                \"longitude\": 8.42142\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/pruszkowski-rower-miejski-pruszkow\",\r\n" + 
		"            \"id\": \"pruszkowski-rower-miejski-pruszkow\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pruszków\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.1637,\r\n" + 
		"                \"longitude\": 20.8018\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Pruszkowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rower-miejski-szamotuly-rms-szamotuly\",\r\n" + 
		"            \"id\": \"rower-miejski-szamotuly-rms-szamotuly\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Szamotuły\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.6112,\r\n" + 
		"                \"longitude\": 16.5819\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rower Miejski Szamotuły\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-dordrecht\",\r\n" + 
		"            \"id\": \"nextbike-dordrecht\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dordrecht\",\r\n" + 
		"                \"country\": \"NL\",\r\n" + 
		"                \"latitude\": 51.7833,\r\n" + 
		"                \"longitude\": 4.69391\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-heppenheim\",\r\n" + 
		"            \"id\": \"vrn-heppenheim\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Heppenheim\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.6431,\r\n" + 
		"                \"longitude\": 8.63889\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/czestochowski-rower-miejski-czestochowa\",\r\n" + 
		"            \"id\": \"czestochowski-rower-miejski-czestochowa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Częstochowa\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.812,\r\n" + 
		"                \"longitude\": 19.1375\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Częstochowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rower-miejski-w-ostrowie-wielkopolskim-ostrow-wielkopolski\",\r\n" + 
		"            \"id\": \"rower-miejski-w-ostrowie-wielkopolskim-ostrow-wielkopolski\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ostrów Wielkopolski\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.65,\r\n" + 
		"                \"longitude\": 17.8253\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rower Miejski w Ostrowie Wielkopolskim\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jerseybike-bayonne\",\r\n" + 
		"            \"id\": \"jerseybike-bayonne\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bayonne\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.6668,\r\n" + 
		"                \"longitude\": -74.1154\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JerseyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jerseybike-guttenberg\",\r\n" + 
		"            \"id\": \"jerseybike-guttenberg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Guttenberg\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.792,\r\n" + 
		"                \"longitude\": -74.0035\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JerseyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jerseybike-west-new-york\",\r\n" + 
		"            \"id\": \"jerseybike-west-new-york\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"West New York\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.7882,\r\n" + 
		"                \"longitude\": -74.0142\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JerseyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/dundee-navigogo-dundee\",\r\n" + 
		"            \"id\": \"dundee-navigogo-dundee\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dundee\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 56.4623,\r\n" + 
		"                \"longitude\": -2.97071\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Dundee-Navigogo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/piaseczynski-rower-miejski-piaseczno\",\r\n" + 
		"            \"id\": \"piaseczynski-rower-miejski-piaseczno\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Piaseczno\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.0733,\r\n" + 
		"                \"longitude\": 21.0269\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Piaseczyński Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-kassel\",\r\n" + 
		"            \"id\": \"nextbike-kassel\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kassel\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.3127,\r\n" + 
		"                \"longitude\": 9.47975\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-sarnen\",\r\n" + 
		"            \"id\": \"nextbike-sarnen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sarnen\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.8963,\r\n" + 
		"                \"longitude\": 8.24614\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-wolfenschiessen\",\r\n" + 
		"            \"id\": \"nextbike-wolfenschiessen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wolfenschiessen\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.9079,\r\n" + 
		"                \"longitude\": 8.39767\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-oberdorf\",\r\n" + 
		"            \"id\": \"nextbike-oberdorf\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Oberdorf\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.9563,\r\n" + 
		"                \"longitude\": 8.3884\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jerseybike-north-bergen\",\r\n" + 
		"            \"id\": \"jerseybike-north-bergen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"North Bergen\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.8045,\r\n" + 
		"                \"longitude\": -74.0135\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JerseyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-giessen\",\r\n" + 
		"            \"id\": \"nextbike-giessen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Gießen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.5943,\r\n" + 
		"                \"longitude\": 8.68097\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-weinheim\",\r\n" + 
		"            \"id\": \"vrn-weinheim\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Weinheim\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.545,\r\n" + 
		"                \"longitude\": 8.66027\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/biker-bialystok-orlen-bialystok\",\r\n" + 
		"            \"id\": \"biker-bialystok-orlen-bialystok\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Białystok\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 53.1342,\r\n" + 
		"                \"longitude\": 23.1485\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BIKER Białystok - Orlen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lrm-lublin-orlen-lublin\",\r\n" + 
		"            \"id\": \"lrm-lublin-orlen-lublin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lublin\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.2469,\r\n" + 
		"                \"longitude\": 22.5697\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"LRM Lublin - Orlen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/wrm-orlen-wroclaw\",\r\n" + 
		"            \"id\": \"wrm-orlen-wroclaw\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wrocław\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.1097,\r\n" + 
		"                \"longitude\": 17.0485\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"WRM - Orlen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lodzki-rower-publiczny-orlen-lodz\",\r\n" + 
		"            \"id\": \"lodzki-rower-publiczny-orlen-lodz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Łódź\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.7689,\r\n" + 
		"                \"longitude\": 19.4554\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Łódzki Rower Publiczny - Orlen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/katowice-bike-orlen-katowice\",\r\n" + 
		"            \"id\": \"katowice-bike-orlen-katowice\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Katowice\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.2594,\r\n" + 
		"                \"longitude\": 19.0215\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Katowice Bike - Orlen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/veturilo-orlen-warszawa\",\r\n" + 
		"            \"id\": \"veturilo-orlen-warszawa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Warszawa\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.2265,\r\n" + 
		"                \"longitude\": 21.0127\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VETURILO - Orlen\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-cardiff\",\r\n" + 
		"            \"id\": \"nextbike-cardiff\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Cardiff\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 51.4848,\r\n" + 
		"                \"longitude\": -3.19062\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-hockenheim\",\r\n" + 
		"            \"id\": \"vrn-hockenheim\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Hockenheim\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.3227,\r\n" + 
		"                \"longitude\": 8.54258\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-schwetzingen\",\r\n" + 
		"            \"id\": \"vrn-schwetzingen\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Schwetzingen\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.3863,\r\n" + 
		"                \"longitude\": 8.5756\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-ennetmoos\",\r\n" + 
		"            \"id\": \"nextbike-ennetmoos\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ennetmoos\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 46.9573,\r\n" + 
		"                \"longitude\": 8.3377\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/vrn-eppelheim\",\r\n" + 
		"            \"id\": \"vrn-eppelheim\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Eppelheim\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 49.4025,\r\n" + 
		"                \"longitude\": 8.6331\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"VRN\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-university-of-surrey\",\r\n" + 
		"            \"id\": \"nextbike-university-of-surrey\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Surrey\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 51.2422,\r\n" + 
		"                \"longitude\": -0.590594\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/santander-cycles-swansea-swansea-university\",\r\n" + 
		"            \"id\": \"santander-cycles-swansea-swansea-university\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Swansea\",\r\n" + 
		"                \"country\": \"GB\",\r\n" + 
		"                \"latitude\": 51.6106,\r\n" + 
		"                \"longitude\": -3.9764\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Santander Cycles\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-kussnacht-sz\",\r\n" + 
		"            \"id\": \"nextbike-kussnacht-sz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Küssnacht SZ\",\r\n" + 
		"                \"country\": \"CH\",\r\n" + 
		"                \"latitude\": 47.0856,\r\n" + 
		"                \"longitude\": 8.44145\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-erfurt\",\r\n" + 
		"            \"id\": \"nextbike-erfurt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Erfurt\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.9785,\r\n" + 
		"                \"longitude\": 11.0334\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bl-bike-banja-luka\",\r\n" + 
		"            \"id\": \"bl-bike-banja-luka\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Banja Luka\",\r\n" + 
		"                \"country\": \"BA\",\r\n" + 
		"                \"latitude\": 44.775,\r\n" + 
		"                \"longitude\": 17.1994\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BL bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/koszalinski-rower-miejski-koszalin\",\r\n" + 
		"            \"id\": \"koszalinski-rower-miejski-koszalin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Koszalin\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 54.2026,\r\n" + 
		"                \"longitude\": 16.1678\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Koszaliński Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/sosnowiecki-rower-miejski-sosnowiec\",\r\n" + 
		"            \"id\": \"sosnowiecki-rower-miejski-sosnowiec\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sosnowiec\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.2823,\r\n" + 
		"                \"longitude\": 19.1269\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Sosnowiecki Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/zabrzanski-rower-miejski-zabrze\",\r\n" + 
		"            \"id\": \"zabrzanski-rower-miejski-zabrze\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zabrze\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.3066,\r\n" + 
		"                \"longitude\": 18.7864\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Zabrzański Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/jerseybike-liberty-state-park\",\r\n" + 
		"            \"id\": \"jerseybike-liberty-state-park\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Liberty State Park\",\r\n" + 
		"                \"country\": \"US\",\r\n" + 
		"                \"latitude\": 40.7051,\r\n" + 
		"                \"longitude\": -74.052\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"JerseyBike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/chartered-bike-bhopal-tata-motors\",\r\n" + 
		"            \"id\": \"chartered-bike-bhopal-tata-motors\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bhopal\",\r\n" + 
		"                \"country\": \"IN\",\r\n" + 
		"                \"latitude\": 18.6556,\r\n" + 
		"                \"longitude\": 73.813\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Chartered Bike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/pobiedziski-rower-gminny-pobiedziska\",\r\n" + 
		"            \"id\": \"pobiedziski-rower-gminny-pobiedziska\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pobiedziska\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.4765,\r\n" + 
		"                \"longitude\": 17.2866\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Pobiedziski Rower Gminny\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lahr-pedelecs-lahr\",\r\n" + 
		"            \"id\": \"lahr-pedelecs-lahr\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lahr\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 48.3396,\r\n" + 
		"                \"longitude\": 7.87376\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/berlin-buch-campus-berlin-buch\",\r\n" + 
		"            \"id\": \"berlin-buch-campus-berlin-buch\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Berlin\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 52.6364,\r\n" + 
		"                \"longitude\": 13.5029\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Berlin-Buch Campus\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-jastrzebie-zdroj\",\r\n" + 
		"            \"id\": \"nextbike-jastrzebie-zdroj\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Jastrzębie-Zdrój\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 49.9497,\r\n" + 
		"                \"longitude\": 18.599\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"System Rowerów Miejskich Jastrzębie Zdrój\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/smartbike-delhi-delhi\",\r\n" + 
		"            \"id\": \"smartbike-delhi-delhi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Delhi\",\r\n" + 
		"                \"country\": \"IN\",\r\n" + 
		"                \"latitude\": 28.6228,\r\n" + 
		"                \"longitude\": 77.2084\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Smartbike Delhi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-swietochlowice\",\r\n" + 
		"            \"id\": \"nextbike-swietochlowice\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Świętochłowice\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.2956,\r\n" + 
		"                \"longitude\": 18.9165\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/piotrkowski-rower-miejski-piotrkow-trybunalski\",\r\n" + 
		"            \"id\": \"piotrkowski-rower-miejski-piotrkow-trybunalski\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Piotrków Trybunalski\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.3992,\r\n" + 
		"                \"longitude\": 19.6971\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Piotrkowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/siemianowicki-rower-miejski-siemianowice-slaskie\",\r\n" + 
		"            \"id\": \"siemianowicki-rower-miejski-siemianowice-slaskie\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Siemianowice Śląskie\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.3031,\r\n" + 
		"                \"longitude\": 19.0222\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Siemianowicki Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-turin\",\r\n" + 
		"            \"id\": \"nextbike-turin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Turin\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 45.0674,\r\n" + 
		"                \"longitude\": 7.66631\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/plocki-rower-miejski-prm-plock\",\r\n" + 
		"            \"id\": \"plocki-rower-miejski-prm-plock\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Płock\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.5421,\r\n" + 
		"                \"longitude\": 19.7081\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Płocki Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lviv-kharkiv\",\r\n" + 
		"            \"id\": \"lviv-kharkiv\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kharkiv\",\r\n" + 
		"                \"country\": \"UA\",\r\n" + 
		"                \"latitude\": 49.9795,\r\n" + 
		"                \"longitude\": 36.2563\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/ciechanowski-rower-miejski-ciechanow\",\r\n" + 
		"            \"id\": \"ciechanowski-rower-miejski-ciechanow\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ciechanów\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.8763,\r\n" + 
		"                \"longitude\": 20.6102\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Ciechanowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/lviv-odessa\",\r\n" + 
		"            \"id\": \"lviv-odessa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Odessa\",\r\n" + 
		"                \"country\": \"UA\",\r\n" + 
		"                \"latitude\": 46.463,\r\n" + 
		"                \"longitude\": 30.7042\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/otwocki-rower-miejski-otwock\",\r\n" + 
		"            \"id\": \"otwocki-rower-miejski-otwock\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Otwock\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.1083,\r\n" + 
		"                \"longitude\": 21.2661\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Otwocki Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tychowski-rower-miejski-tychowo\",\r\n" + 
		"            \"id\": \"tychowski-rower-miejski-tychowo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tychowo\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 53.9395,\r\n" + 
		"                \"longitude\": 16.2306\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tychowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/zielonogorski-rower-miejski-zielona-gora\",\r\n" + 
		"            \"id\": \"zielonogorski-rower-miejski-zielona-gora\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zielona Góra\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.9381,\r\n" + 
		"                \"longitude\": 15.5048\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Zielonogórski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/santander-monchengladbach\",\r\n" + 
		"            \"id\": \"santander-monchengladbach\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Mönchengladbach\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.1817,\r\n" + 
		"                \"longitude\": 6.43578\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Santander Mönchengladbach\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nomagobikes-celje\",\r\n" + 
		"            \"id\": \"nomagobikes-celje\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Celje\",\r\n" + 
		"                \"country\": \"SI\",\r\n" + 
		"                \"latitude\": 46.2388,\r\n" + 
		"                \"longitude\": 15.2693\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"NomagoBikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bilbon-bizi\",\r\n" + 
		"            \"id\": \"bilbon-bizi\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bilbao\",\r\n" + 
		"                \"country\": \"ES\",\r\n" + 
		"                \"latitude\": 43.2752,\r\n" + 
		"                \"longitude\": -2.93528\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BilbonBizi\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tychowski-rower-miejski-atrakcje-turystyczne-tychowo\",\r\n" + 
		"            \"id\": \"tychowski-rower-miejski-atrakcje-turystyczne-tychowo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tychowo\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 53.9294,\r\n" + 
		"                \"longitude\": 16.2467\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Atrakcje turystyczne Tychowo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nomagobikes-lasko\",\r\n" + 
		"            \"id\": \"nomagobikes-lasko\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Laško\",\r\n" + 
		"                \"country\": \"SI\",\r\n" + 
		"                \"latitude\": 46.1458,\r\n" + 
		"                \"longitude\": 15.2312\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"NomagoBikes\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-lippstadt\",\r\n" + 
		"            \"id\": \"nextbike-lippstadt\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Lippstadt\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.6755,\r\n" + 
		"                \"longitude\": 8.34394\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bikekia-zilina\",\r\n" + 
		"            \"id\": \"bikekia-zilina\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Žilina\",\r\n" + 
		"                \"country\": \"SK\",\r\n" + 
		"                \"latitude\": 49.2217,\r\n" + 
		"                \"longitude\": 18.7572\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BikeKia\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/koninski-rower-miejski-konin\",\r\n" + 
		"            \"id\": \"koninski-rower-miejski-konin\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Konin\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.2284,\r\n" + 
		"                \"longitude\": 18.2553\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Koniński Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-vinnytsia\",\r\n" + 
		"            \"id\": \"nextbike-vinnytsia\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Vinnytsia\",\r\n" + 
		"                \"country\": \"UA\",\r\n" + 
		"                \"latitude\": 49.2328,\r\n" + 
		"                \"longitude\": 28.4625\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-bonn\",\r\n" + 
		"            \"id\": \"nextbike-bonn\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Bonn\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 50.7367,\r\n" + 
		"                \"longitude\": 7.09541\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/tarnowski-rower-miejski-tarnow\",\r\n" + 
		"            \"id\": \"tarnowski-rower-miejski-tarnow\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Tarnów\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.0113,\r\n" + 
		"                \"longitude\": 20.9728\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Tarnowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/kolo-marek-marki\",\r\n" + 
		"            \"id\": \"kolo-marek-marki\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Marki\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.3256,\r\n" + 
		"                \"longitude\": 21.1089\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Koło Marek\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/zyrardowski-rower-miejski-zyrardow\",\r\n" + 
		"            \"id\": \"zyrardowski-rower-miejski-zyrardow\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Żyrardów\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.0503,\r\n" + 
		"                \"longitude\": 20.4464\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Żyrardowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/kajteroz-chorzowski-rower-miejski-chorzow\",\r\n" + 
		"            \"id\": \"kajteroz-chorzowski-rower-miejski-chorzow\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Chorzów\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 50.2969,\r\n" + 
		"                \"longitude\": 18.9551\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Kajteroz - Chorzowski Rower Miejski\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-koluszki\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-koluszki\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Koluszki\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.7401,\r\n" + 
		"                \"longitude\": 19.835\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-lask\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-lask\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Łask\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.5893,\r\n" + 
		"                \"longitude\": 19.142\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-lowicz\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-lowicz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Łowicz\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.1057,\r\n" + 
		"                \"longitude\": 19.9381\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-pabianice\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-pabianice\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Pabianice\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.6651,\r\n" + 
		"                \"longitude\": 19.3548\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-sieradz\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-sieradz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Sieradz\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.5902,\r\n" + 
		"                \"longitude\": 18.7382\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-skierniewice\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-skierniewice\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Skierniewice\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.9539,\r\n" + 
		"                \"longitude\": 20.1469\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-zdunska-wola\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-zdunska-wola\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zduńska Wola\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.6011,\r\n" + 
		"                \"longitude\": 18.938\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-zgierz\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-zgierz\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Zgierz\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.8551,\r\n" + 
		"                \"longitude\": 19.4068\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-kutno\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-kutno\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Kutno\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 52.2317,\r\n" + 
		"                \"longitude\": 19.3564\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/rowerowe-lodzkie-rl-lodz-rl\",\r\n" + 
		"            \"id\": \"rowerowe-lodzkie-rl-lodz-rl\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Łódź\",\r\n" + 
		"                \"country\": \"PL\",\r\n" + 
		"                \"latitude\": 51.7674,\r\n" + 
		"                \"longitude\": 19.4575\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Rowerowe Łódzkie\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-odesa\",\r\n" + 
		"            \"id\": \"nextbike-odesa\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Odesa\",\r\n" + 
		"                \"country\": \"UA\",\r\n" + 
		"                \"latitude\": 46.4672,\r\n" + 
		"                \"longitude\": 30.7164\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-alvsjo\",\r\n" + 
		"            \"id\": \"nextbike-alvsjo\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Älvsjö\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 59.2745,\r\n" + 
		"                \"longitude\": 18.005\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-wittenberge\",\r\n" + 
		"            \"id\": \"nextbike-wittenberge\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Wittenberge\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 52.9952,\r\n" + 
		"                \"longitude\": 11.7517\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/frelo-freiburg\",\r\n" + 
		"            \"id\": \"frelo-freiburg\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Freiburg\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 47.9958,\r\n" + 
		"                \"longitude\": 7.84453\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Frelo\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Comunicare S.r.l.\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/bicincitta-trieste\",\r\n" + 
		"            \"id\": \"bicincitta-trieste\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Trieste\",\r\n" + 
		"                \"country\": \"IT\",\r\n" + 
		"                \"latitude\": 45.6495,\r\n" + 
		"                \"longitude\": 13.7768\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"BiTS\",\r\n" + 
		"            \"source\": \"http://www.bicincitta.com/frmLeStazioni.aspx?ID=266\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/mobibike-dresden\",\r\n" + 
		"            \"id\": \"mobibike-dresden\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Dresden\",\r\n" + 
		"                \"country\": \"DE\",\r\n" + 
		"                \"latitude\": 51.0535,\r\n" + 
		"                \"longitude\": 13.7387\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"MOBIbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ЗАО «СитиБайк»\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velobike-murmansk\",\r\n" + 
		"            \"id\": \"velobike-murmansk\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Murmansk\",\r\n" + 
		"                \"country\": \"RU\",\r\n" + 
		"                \"latitude\": 68.968,\r\n" + 
		"                \"longitude\": 33.074\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velobike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"ЗАО «СитиБайк»\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/velobike-nizhniy-novgorod\",\r\n" + 
		"            \"id\": \"velobike-nizhniy-novgorod\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Nizhniy Novgorod\",\r\n" + 
		"                \"country\": \"RU\",\r\n" + 
		"                \"latitude\": 56.194,\r\n" + 
		"                \"longitude\": 44.003\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Velobike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Nextbike GmbH\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/nextbike-ivano-frankivsk\",\r\n" + 
		"            \"id\": \"nextbike-ivano-frankivsk\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Ivano Frankivsk\",\r\n" + 
		"                \"country\": \"UA\",\r\n" + 
		"                \"latitude\": 48.9281,\r\n" + 
		"                \"longitude\": 24.7103\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Nextbike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Velobike.kz, LLP\",\r\n" + 
		"                \"Smoove\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/almatybike\",\r\n" + 
		"            \"id\": \"almatybike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Almaty\",\r\n" + 
		"                \"country\": \"KZ\",\r\n" + 
		"                \"latitude\": 43.239101,\r\n" + 
		"                \"longitude\": 76.9268076\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Almatybike\"\r\n" + 
		"        },\r\n" + 
		"        {\r\n" + 
		"            \"company\": [\r\n" + 
		"                \"Velobike.kz, LLP\",\r\n" + 
		"                \"Smoove\"\r\n" + 
		"            ],\r\n" + 
		"            \"href\": \"/v2/networks/shymkentbike\",\r\n" + 
		"            \"id\": \"shymkentbike\",\r\n" + 
		"            \"location\": {\r\n" + 
		"                \"city\": \"Shymkent\",\r\n" + 
		"                \"country\": \"KZ\",\r\n" + 
		"                \"latitude\": 42.3184,\r\n" + 
		"                \"longitude\": 69.5978\r\n" + 
		"            },\r\n" + 
		"            \"name\": \"Shymkentbike\"\r\n" + 
		"        }\r\n" + 
		"    ]\r\n" + 
		"}";
	}
	
	
	

}
