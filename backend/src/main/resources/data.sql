INSERT INTO b4db.diary
(birth_date, breeds, name, special_note, weight)
VALUES('2010-01-01', '�ڸ��ȼ����', '�ɾ���' , null , 5.5);
INSERT INTO b4db.diary
(birth_date, breeds, name, special_note, weight)
VALUES('2010-12-01', '��', '���̸�' , '�빦' , 4.5);
INSERT INTO b4db.diary
(birth_date, breeds, name, special_note, weight)
VALUES('2008-12-01', '��', '�ɺ���' , 'ġ��' , 5.5);


INSERT INTO b4db.daily_record
(`date`, water, feces, feed, medication, special_note, urin, vomitin, weight, diary_id)
VALUES('2023-04-01', 10, 30, 5, '��ħ��, ���ɾ�', NULL, 3, 3, NULL, 1);

INSERT INTO b4db.daily_record
(`date`, water, feces, feed, medication, special_note, urin, vomitin, weight, diary_id)
VALUES('2023-03-31', 30, 20, 5, '��ħ��, ���ɾ�', NULL, 3, 3, NULL, 1);


INSERT INTO b4db.daily_record
(`date`, water, feces, feed, medication, special_note, urin, vomitin, weight, diary_id)
VALUES('2023-03-30', 30, 50, 5, '���ɾ�', NULL, 3, 3, NULL, 1);
