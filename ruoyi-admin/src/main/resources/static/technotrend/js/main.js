$(document).ready(function($) {



//¸ü¶àÏÂÔØ£ºhttp://www.bootstrapmb.com
// scroll functions
$(window).scroll(function(e) {

    // add/remove class to navbar when scrolling to hide/show
    var scroll = $(window).scrollTop();
    if (scroll >= 150) {
        $('.navbar').addClass("sticky");
    } else {
        $('.navbar').removeClass("sticky");
    }

});



$(".cart-nav").click(function(){
  $(".cart-info").toggleClass("visible");
});

$(".s_toggle").click(function(){
	event.preventDefault()
  $(".search_toggle").toggleClass("visible");
});


var btn = $('#backtotop');

$(window).scroll(function() {
  if ($(window).scrollTop() > 300) {
    btn.addClass('show');
  } else {
    btn.removeClass('show');
  }
});

btn.on('click', function(e) {
  e.preventDefault();
  $('html, body').animate({scrollTop:0}, '300');
});


	
});