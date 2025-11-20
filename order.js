const container = document.getElementById("product-container");

fetch("http://localhost:8080/api")  // or /api/products if you change the endpoint
    .then(response => response.json())
    .then(products => {
        products.forEach(product => {
            const card = document.createElement("div");
            card.className = "product-card";
            card.innerHTML = `
                <img src="${product.imageurl}" alt="${product.imagealt}">
                <h3>${product.foodname}</h3>
                <p>Price: $${product.price}</p>
            `;
            container.appendChild(card);
        });
    })
    .catch(error => console.error("Error fetching products:", error));

