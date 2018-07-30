$(function(){
	$("#submit").click(function(){
		var username = $("#username").val(),
		password = $("#password").val();
		$.ajax({ 
			url: "/login",
			type: "POST",
	        dataType : "JSON",
			data: {
				username,
				password
			},
			success: function(data) {
				console.info(data);
	        }
		});
	})
})