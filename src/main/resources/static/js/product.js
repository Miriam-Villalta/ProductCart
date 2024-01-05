// Call the dataTables jQuery plugin
/*$document.ready(function() {
    loadProducts();
  $('#products').DataTable();
});*/

document.addEventListener("load", loadProducts);


async function loadProducts(){
    //fetch de products from database
    (async () => {
      const request = await fetch('products', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        //body: JSON.stringify({a: 1, b: 'Textual content'})
      });
      const products = await request.json();

      console.log(products);
    })();
}
