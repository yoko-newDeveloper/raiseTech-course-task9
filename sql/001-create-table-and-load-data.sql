DROP TABLE IF EXISTS skiresort;

CREATE TABLE skiresort (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  area VARCHAR(100) NOT NULL,
  customerEvaluation VARCHAR(255) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO skiresort (id, name, area, customerEvaluation) VALUES (1, "niseko", "hokkaido", "spacious and nice view");
INSERT INTO skiresort (id, name, area, customerEvaluation) VALUES (2, "appi", "iwate","only Hakuba-sanzan can be seen");
INSERT INTO skiresort (id, name, area, customerEvaluation) VALUES (3, "hakubahappoone", "nagano", "a slope with various courses");
