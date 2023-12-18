package org.finley.inshur;

public class OpenAPIResults {
    public static final String ONEPERIOD = "{\n" +
            "       \"cod\":\"200\",\n" +
            "       \"message\":0,\n" +
            "       \"cnt\":1,\n" +
            "       \"list\":[\n" +
            "          {\n" +
            "             \"dt\":1702846800,\n" +
            "             \"main\":{\n" +
            "                \"temp\":10.06,\n" +
            "                \"feels_like\":9.26,\n" +
            "                \"temp_min\":9.5,\n" +
            "                \"temp_max\":10.06,\n" +
            "                \"pressure\":1031,\n" +
            "                \"sea_level\":1031,\n" +
            "                \"grnd_level\":1029,\n" +
            "                \"humidity\":82,\n" +
            "                \"temp_kf\":0.56\n" +
            "             },\n" +
            "             \"weather\":[\n" +
            "                {\n" +
            "                   \"id\":803,\n" +
            "                   \"main\":\"Clouds\",\n" +
            "                   \"description\":\"broken clouds\",\n" +
            "                   \"icon\":\"04n\"\n" +
            "                }\n" +
            "             ],\n" +
            "             \"clouds\":{\n" +
            "                \"all\":75\n" +
            "             },\n" +
            "             \"wind\":{\n" +
            "                \"speed\":5.15,\n" +
            "                \"deg\":232,\n" +
            "                \"gust\":13.56\n" +
            "             },\n" +
            "             \"visibility\":10000,\n" +
            "             \"pop\":0,\n" +
            "             \"sys\":{\n" +
            "                \"pod\":\"n\"\n" +
            "             },\n" +
            "             \"dt_txt\":\"2023-12-17 21:00:00\"\n" +
            "          }\n" +
            "       ],\n" +
            "       \"city\":{\n" +
            "          \"id\":2643743,\n" +
            "          \"name\":\"London\",\n" +
            "          \"coord\":{\n" +
            "             \"lat\":51.5085,\n" +
            "             \"lon\":-0.1257\n" +
            "          },\n" +
            "          \"country\":\"GB\",\n" +
            "          \"population\":1000000,\n" +
            "          \"timezone\":0,\n" +
            "          \"sunrise\":1702800065,\n" +
            "          \"sunset\":1702828310\n" +
            "       }\n" +
            "    }";

    public static final String EIGHTPERIOD = "{\n" +
            "    \"cod\": \"200\",\n" +
            "    \"message\": 0,\n" +
            "    \"cnt\": 8,\n" +
            "    \"list\": [\n" +
            "        {\n" +
            "            \"dt\": 1702857600,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 3.54,\n" +
            "                \"feels_like\": 1.8,\n" +
            "                \"temp_min\": 3.54,\n" +
            "                \"temp_max\": 5.81,\n" +
            "                \"pressure\": 1036,\n" +
            "                \"sea_level\": 1036,\n" +
            "                \"grnd_level\": 1031,\n" +
            "                \"humidity\": 95,\n" +
            "                \"temp_kf\": -2.27\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 804,\n" +
            "                    \"main\": \"Clouds\",\n" +
            "                    \"description\": \"overcast clouds\",\n" +
            "                    \"icon\": \"04n\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 100\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 1.88,\n" +
            "                \"deg\": 206,\n" +
            "                \"gust\": 2.94\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"n\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 00:00:00\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"dt\": 1702868400,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 4.11,\n" +
            "                \"feels_like\": 2.45,\n" +
            "                \"temp_min\": 4.11,\n" +
            "                \"temp_max\": 5.25,\n" +
            "                \"pressure\": 1036,\n" +
            "                \"sea_level\": 1036,\n" +
            "                \"grnd_level\": 1031,\n" +
            "                \"humidity\": 87,\n" +
            "                \"temp_kf\": -1.14\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 803,\n" +
            "                    \"main\": \"Clouds\",\n" +
            "                    \"description\": \"broken clouds\",\n" +
            "                    \"icon\": \"04n\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 67\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 1.89,\n" +
            "                \"deg\": 211,\n" +
            "                \"gust\": 3.4\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"n\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 03:00:00\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"dt\": 1702879200,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 4.34,\n" +
            "                \"feels_like\": 2.89,\n" +
            "                \"temp_min\": 4.34,\n" +
            "                \"temp_max\": 4.74,\n" +
            "                \"pressure\": 1035,\n" +
            "                \"sea_level\": 1035,\n" +
            "                \"grnd_level\": 1031,\n" +
            "                \"humidity\": 79,\n" +
            "                \"temp_kf\": -0.4\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 802,\n" +
            "                    \"main\": \"Clouds\",\n" +
            "                    \"description\": \"scattered clouds\",\n" +
            "                    \"icon\": \"03n\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 33\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 1.74,\n" +
            "                \"deg\": 211,\n" +
            "                \"gust\": 2.5\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"n\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 06:00:00\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"dt\": 1702890000,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 5.1,\n" +
            "                \"feels_like\": 3.59,\n" +
            "                \"temp_min\": 5.1,\n" +
            "                \"temp_max\": 5.1,\n" +
            "                \"pressure\": 1036,\n" +
            "                \"sea_level\": 1036,\n" +
            "                \"grnd_level\": 1031,\n" +
            "                \"humidity\": 69,\n" +
            "                \"temp_kf\": 0\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 800,\n" +
            "                    \"main\": \"Clear\",\n" +
            "                    \"description\": \"clear sky\",\n" +
            "                    \"icon\": \"01d\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 0\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 1.9,\n" +
            "                \"deg\": 207,\n" +
            "                \"gust\": 4.58\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"d\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 09:00:00\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"dt\": 1702900800,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 8.31,\n" +
            "                \"feels_like\": 6.59,\n" +
            "                \"temp_min\": 8.31,\n" +
            "                \"temp_max\": 8.31,\n" +
            "                \"pressure\": 1034,\n" +
            "                \"sea_level\": 1034,\n" +
            "                \"grnd_level\": 1030,\n" +
            "                \"humidity\": 56,\n" +
            "                \"temp_kf\": 0\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 800,\n" +
            "                    \"main\": \"Clear\",\n" +
            "                    \"description\": \"clear sky\",\n" +
            "                    \"icon\": \"01d\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 0\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 2.83,\n" +
            "                \"deg\": 218,\n" +
            "                \"gust\": 5.61\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"d\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 12:00:00\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"dt\": 1702911600,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 8.39,\n" +
            "                \"feels_like\": 7.14,\n" +
            "                \"temp_min\": 8.39,\n" +
            "                \"temp_max\": 8.39,\n" +
            "                \"pressure\": 1033,\n" +
            "                \"sea_level\": 1033,\n" +
            "                \"grnd_level\": 1028,\n" +
            "                \"humidity\": 58,\n" +
            "                \"temp_kf\": 0\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 800,\n" +
            "                    \"main\": \"Clear\",\n" +
            "                    \"description\": \"clear sky\",\n" +
            "                    \"icon\": \"01d\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 1\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 2.21,\n" +
            "                \"deg\": 224,\n" +
            "                \"gust\": 5.49\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"d\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 15:00:00\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"dt\": 1702922400,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 6.32,\n" +
            "                \"feels_like\": 4.65,\n" +
            "                \"temp_min\": 6.32,\n" +
            "                \"temp_max\": 6.32,\n" +
            "                \"pressure\": 1033,\n" +
            "                \"sea_level\": 1033,\n" +
            "                \"grnd_level\": 1028,\n" +
            "                \"humidity\": 67,\n" +
            "                \"temp_kf\": 0\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 802,\n" +
            "                    \"main\": \"Clouds\",\n" +
            "                    \"description\": \"scattered clouds\",\n" +
            "                    \"icon\": \"03n\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 38\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 2.28,\n" +
            "                \"deg\": 235,\n" +
            "                \"gust\": 6.4\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"n\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 18:00:00\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"dt\": 1702933200,\n" +
            "            \"main\": {\n" +
            "                \"temp\": 5.24,\n" +
            "                \"feels_like\": 3.43,\n" +
            "                \"temp_min\": 5.24,\n" +
            "                \"temp_max\": 5.24,\n" +
            "                \"pressure\": 1033,\n" +
            "                \"sea_level\": 1033,\n" +
            "                \"grnd_level\": 1028,\n" +
            "                \"humidity\": 70,\n" +
            "                \"temp_kf\": 0\n" +
            "            },\n" +
            "            \"weather\": [\n" +
            "                {\n" +
            "                    \"id\": 804,\n" +
            "                    \"main\": \"Clouds\",\n" +
            "                    \"description\": \"overcast clouds\",\n" +
            "                    \"icon\": \"04n\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"clouds\": {\n" +
            "                \"all\": 92\n" +
            "            },\n" +
            "            \"wind\": {\n" +
            "                \"speed\": 2.22,\n" +
            "                \"deg\": 222,\n" +
            "                \"gust\": 5.94\n" +
            "            },\n" +
            "            \"visibility\": 10000,\n" +
            "            \"pop\": 0,\n" +
            "            \"sys\": {\n" +
            "                \"pod\": \"n\"\n" +
            "            },\n" +
            "            \"dt_txt\": \"2023-12-18 21:00:00\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"city\": {\n" +
            "        \"id\": 2988507,\n" +
            "        \"name\": \"Paris\",\n" +
            "        \"coord\": {\n" +
            "            \"lat\": 48.8534,\n" +
            "            \"lon\": 2.3488\n" +
            "        },\n" +
            "        \"country\": \"FR\",\n" +
            "        \"population\": 2138551,\n" +
            "        \"timezone\": 3600,\n" +
            "        \"sunrise\": 1702885161,\n" +
            "        \"sunset\": 1702914882\n" +
            "    }\n" +
            "}";
}
