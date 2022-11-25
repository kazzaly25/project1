
$("#myTable").dataTable(
	{
	columns:[null,null,null,
		{
		"data":null,
		"default content":"<input type=button value=edit  onclick=edit()/>"
		},
		{
		"data":null,
		"default content":"<input type=button value=delete onclick=delete()/>"
		
}]
});