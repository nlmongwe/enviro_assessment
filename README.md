# enviro_assessment

To tun the app navigate to DemoApplication and run the main method

To get all waste use the following end-point "http://localhost:8080/api/v1/waste"
no payload required, The waste table gets populated with data during the booting up of Tomacat

To get waste by id use the following end-point "http://localhost:8080/api/v1/waste/1"
the number 1 at the end of the end-point represents the wast id as it appears in repository or in return when getting all waste

To add waste use the following end-point "http://localhost:8080/api/v1/waste/add"
example payload:
{
"name": "Styrofoam3",
"category": "General Waste",
"disposalMethod": "Dispose in trash",
"recyclingTips": "Avoid using"
}
waste id not required when adding a waste object

To delete a waste object use the following end-point "http://localhost:8080/api/v1/waste/delete"
example payload:
{
"id": 4,
"name": "Styrofoam",
"category": "General Waste",
"disposalMethod": "Dispose in trash",
"recyclingTips": "Avoid using"
}
The data in the payload needs to match the object you wish to delete from the database

To delete a waste object use the following end-point "http://localhost:8080/api/v1/waste/delete/byId"
example payload:
{
"id": 6
}
the id equal to the waste object Id that you wish to delete

To update a waste object use the following end-point "http://localhost:8080/api/v1/waste/update/1"
the 1 at the end of the end-point is the waste object id you with to update
example payload:
{
"name": "Update name",
"category": "Update category",
"disposalMethod": "Update disposal method",
"recyclingTips": "add recycling tips"
}
you can update all the values at once or just a single value, you must include the values you want to keep unchanged