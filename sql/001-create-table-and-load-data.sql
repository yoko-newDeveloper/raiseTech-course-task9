DROP TABLE IF EXISTS skiresort;

CREATE TABLE skiresort (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  area VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO skiresort (id, name, area) VALUES (1, "niseko", "hokkaido");
INSERT INTO skiresort (id, name, area) VALUES (2, "appi", "iwate");
INSERT INTO skiresort (id, name, area) VALUES (3, "hakubahappoone", "nagano");
