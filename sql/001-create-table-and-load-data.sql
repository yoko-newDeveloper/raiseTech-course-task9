DROP TABLE IF EXISTS skiresort;

CREATE TABLE skiresort (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  area VARCHAR(100) NOT NULL,
  customerEvaluation VARCHAR(255) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO skiresort (id, name, area, customerEvaluation) VALUES (1, "niseko", "hokkaido", "外国人が多い");
INSERT INTO skiresort (id, name, area, customerEvaluation) VALUES (2, "appi", "iwate","コースがバラエティに富んでいる");
INSERT INTO skiresort (id, name, area, customerEvaluation) VALUES (3, "hakubahappoone", "nagano", "唯一白馬三山が目の前で見られて絶景");
