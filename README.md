"# swagger2" 

Spring Boot Application as Reast Api.

Using ConcurrentHashMap for storing the Object in memory without database as:

ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

@Api	Marks a class as a Swagger resource.

@ApiModel	Provides additional information about Swagger models.

@ApiModelProperty	Adds and manipulates data of a model property.

@ApiOperation	Describes an operation or typically an HTTP method against a specific path.

@ApiParam	Adds additional meta-data for operation parameters.

@ApiResponse	Describes a possible response of an operation.

@ApiResponses	A wrapper to allow a list of multiple ApiResponse objects.


To view Swagger2 Ui API details : http://localhost:8080/swagger-ui.html

For full Json call details : http://localhost:8080/v2/api-docs

to enable swagger 2 use @EnableSwagger2

then create Doket Bean:

@Bean
public Docket swaggerConfiguration() {
return new Docket(DocumentationType.SWAGGER_2)
.select()
.paths(PathSelectors.ant("/api/*"))
.apis(RequestHandlerSelectors.basePackage("com.example"))
.build().apiInfo(apiEndPointsInfo());
}

Test with Postman:
POST
Body
raw
{
	"id":"omar",
	"name":"Omar Al-Salih",
	"phone":"123-123-1234"
}