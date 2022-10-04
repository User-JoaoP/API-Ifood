INSERT INTO restaurant (id, zip_code, district, name) VALUES
(1L, '0001', 'Brooklin', 'Portucho'),
(2L, '0002', 'Queens', 'La Hueca');

INSERT INTO client (id, zip_code, district, name) VALUES
(1L, '0001', 'Queens', 'Bob'),
(2L, '0002', 'Bronx', 'Tom');

INSERT INTO product (id, available, name, unitary_value, restaurant_id) VALUES
(1L, true, 'Rice', 5.0, 1L),
(2L, true, 'Spaghetti', 8.0, 1L),
(3L, true, 'Barbecue', 8.5, 2L);

INSERT INTO cart (id, form_payment, amount, closed, client_id) VALUES
(1L, 0, false, 0.0, 1L);