--
-- Database: `springmvc`
--
--
-- 表的结构 `sm_user`
--

CREATE TABLE `sm_user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

ALTER TABLE `sm_user`
  ADD PRIMARY KEY (`id`);

INSERT INTO `sm_user` (`id`, `username`, `password`, `email`) VALUES
(1, 'yueer', '1234', 'zyue0119@163.com');

